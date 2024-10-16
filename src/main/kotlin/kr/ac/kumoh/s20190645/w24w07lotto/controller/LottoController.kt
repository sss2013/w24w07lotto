package kr.ac.kumoh.s20190645.w24w07lotto.controller

import kr.ac.kumoh.s20190645.w24w07lotto.service.LottoService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LottoController(val lottoService: LottoService) {
    @GetMapping("/lotto/numbers")
    fun generateNumbers(model:Model): String{
        model.addAttribute("numbers",lottoService.getLuckyNumbers())
        return "lotto"
    }
}