package xyz.hanabinoir.lab.cantonese

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.persistence.*

@Entity
@Table(name = "cantonese",
        uniqueConstraints = [
                UniqueConstraint(name = "code_spelling",
                        columnNames = ["code", "jyutping"])
        ])
@ApiModel("粵字、編碼及拼音")
class Cantonese (
        @Id
        @ApiModelProperty("中日韓統一編碼")
        val code: String,
        @ApiModelProperty("粵字")
        val char: Char,
        @ApiModelProperty("粵拼")
        val jyutping: String,
        @ApiModelProperty("耶魯拼音及粵拼聲調")
        val yale: String
)