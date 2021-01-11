package xyz.hanabinoir.lab.rime

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import javax.persistence.*

/**
 * 小韻
 */
@Entity
@Table(name = "broad_rime")
@ApiModel("小韻")
data class Rime (
        @Id
        @ApiModelProperty("字表編號")
        val id: Int,

        @ApiModelProperty("韻")
        val chart: String,

        @ApiModelProperty("聲")
        val consonant: String,

        @ApiModelProperty("等")
        val division: Int,

        @Column(name = "is_open")
        @ApiModelProperty("呼")
        val isOpen: Boolean,

        @Enumerated(EnumType.STRING)
        @ApiModelProperty("調（平上去入）")
        val tone: Tone,

        @ApiModelProperty("反切")
        val spelling: String,

        @ApiModelProperty("攝")
        val group: String,

        @ApiModelProperty("包含漢字")
        val characters: String,

        @ApiModelProperty("包含字數")
        val charactersCount: Int,

        @ApiModelProperty("古韻羅馬字")
        val romanized: String,

        @ApiModelProperty("拼音")
        val pinyin: String,

        @ApiModelProperty("平水韻")
        val pingshui: String
)

/**
 * 聲調（平上去入）
 */
enum class Tone {
        EVEN,
        RISING,
        DEPARTING,
        CHECKED
}