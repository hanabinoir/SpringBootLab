package xyz.hanabinoir.lab.rime

import javax.persistence.*

/**
 * 小韻
 */
@Entity
@Table(name = "broad_rime")
data class Rime (
        @Id
        val id: Int,

        val chart: String,

        val consonant: String,

        val division: Int,

        @Column(name = "is_open")
        val isOpen: Boolean,

        @Enumerated(EnumType.STRING)
        val tone: Tone,

        val spelling: String,

        val group: String,

        val characters: String,

        val charactersCount: Int,

        /// 古韻羅馬字
        val romanized: String,

        /// 拼音
        val pinyin: String,

        /// 平水韻
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