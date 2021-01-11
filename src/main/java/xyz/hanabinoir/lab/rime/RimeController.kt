package xyz.hanabinoir.lab.rime

import io.swagger.annotations.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rime")
@Api("韻典查詢")
class RimeController(private val service: RimeService) {

    @GetMapping("/{character}")
    @ApiOperation("按字查韻")
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "查詢結果", response = Rime::class)
    ])
    fun getByCharacter(@ApiParam(name = "character", value = "字")
                       @PathVariable character: String)
            = service.findRimes(character)
}