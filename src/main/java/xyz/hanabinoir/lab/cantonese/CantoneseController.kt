package xyz.hanabinoir.lab.cantonese

import io.swagger.annotations.*
import org.springframework.web.bind.annotation.*
import xyz.hanabinoir.lab.rime.Rime

@RestController
@RequestMapping("/cantonese")
@Api("粵拼")
class CantoneseController(private val service: CantoneseService) {

    @GetMapping("/{spelling}")
    @ApiOperation("粵拼查字")
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "查詢結果", response = Cantonese::class)
    ])
    fun findBySpelling(@ApiParam(name = "spelling", value = "粵拼")
                        @PathVariable spelling: String)
            = service.findBySpelling(spelling)

    @GetMapping("/{char}")
    @ApiOperation("按字查音")
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "查詢結果", response = Cantonese::class)
    ])
    fun findByChar(@ApiParam(name = "char", value = "字")
                       @PathVariable char: Char)
            = service.findByChar(char)

    @GetMapping("/jyutping/{char}")
    @ApiOperation("粵拼")
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "粵拼", response = String::class)
    ])
    fun findJyutping(@ApiParam(name = "char", value = "字")
                   @PathVariable char: Char)
            = service.findJyutping(char)

    @GetMapping("/yale/{char}")
    @ApiOperation("耶魯拼音")
    @ApiResponses(value = [
        ApiResponse(code = 200, message = "耶魯拼音", response = String::class)
    ])
    fun findYale(@ApiParam(name = "char", value = "字")
                   @PathVariable char: Char)
            = service.findYale(char)
}