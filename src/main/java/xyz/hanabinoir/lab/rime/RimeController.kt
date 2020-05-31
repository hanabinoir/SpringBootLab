package xyz.hanabinoir.lab.rime

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rimes")
@Api("韻典查詢")
class RimeController(private val service: RimeService) {

    @GetMapping("/{character}")
    @ApiOperation("按字查韻")
    fun getByCharacter(@ApiParam(name = "character", value = "字")
                       @PathVariable character: String)
            = service.findRimes(character)
}