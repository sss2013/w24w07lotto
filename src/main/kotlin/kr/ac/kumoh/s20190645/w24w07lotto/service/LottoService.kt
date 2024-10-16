package kr.ac.kumoh.s20190645.w24w07lotto.service

import org.springframework.stereotype.Service
import java.util.*

@Service
class LottoService {
    fun getLuckyNumbers():Array<Int>{
        val numbers = arrayOf(0, 0 , 0 , 0 , 0 , 0 )
        for (i in numbers.indices)
            numbers[i]= Random().nextInt(45)+1
        return numbers
    }
}