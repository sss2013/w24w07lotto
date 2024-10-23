package kr.ac.kumoh.s20190645.w24w07lotto.service

import kr.ac.kumoh.s20190645.w24w07lotto.model.LottoNumber
import kr.ac.kumoh.s20190645.w24w07lotto.repository.InMemoryLottoRepository
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class LottoService(val lottoRepository: InMemoryLottoRepository) {
    fun getLuckyNumbers(): LottoNumber? {
        val numbers=mutableSetOf<Int>()

        while(numbers.size<6){
            numbers.add(Random.nextInt(1,46))
        }

        val lottoNumber= LottoNumber(numbers.toSortedSet().toIntArray())

        return lottoRepository.save(lottoNumber)
    }
}