package kr.ac.kumoh.s20190645.w24w07lotto.repository

import kr.ac.kumoh.s20190645.w24w07lotto.model.LottoNumber
import org.springframework.stereotype.Repository

@Repository
class InMemoryLottoRepository : LottoRepository {
    private var storedLottoNumber: LottoNumber? = null

    override fun save(lottoNumber: LottoNumber): LottoNumber? {
        storedLottoNumber = lottoNumber

        return storedLottoNumber
    }

    override fun find(): LottoNumber? {
        return storedLottoNumber
    }

}