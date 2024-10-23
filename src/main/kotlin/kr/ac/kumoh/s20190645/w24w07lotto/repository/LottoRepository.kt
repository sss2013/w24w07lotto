package kr.ac.kumoh.s20190645.w24w07lotto.repository

import kr.ac.kumoh.s20190645.w24w07lotto.model.LottoNumber
import org.springframework.stereotype.Repository

@Repository
interface LottoRepository {
    fun save(lottoNumber: LottoNumber):LottoNumber?
    fun find():LottoNumber?
}