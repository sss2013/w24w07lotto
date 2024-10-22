package kr.ac.kumoh.s20190645.w24w07lotto.service

import org.springframework.stereotype.Service
import java.util.*
import kotlin.random.Random

@Service
class LottoService {
    fun getLuckyNumbers():IntArray{
        val numbers=mutableSetOf<Int>()

        while(numbers.size<6){
            numbers.add(Random.nextInt(1,46))
        }

        return numbers.toSortedSet().toIntArray()
    }
}