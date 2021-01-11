package xyz.hanabinoir.lab.cantonese

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CantoneseRepository: JpaRepository<Cantonese, String> {

    // 粵拼查字
    fun findByJyutping(spelling: String): MutableList<Cantonese>
    fun findByJyutpingContains(spelling: String): MutableList<Cantonese>
    fun findByYale(spelling: String): MutableList<Cantonese>
    fun findByYaleContains(spelling: String): MutableList<Cantonese>

    // 按字查音
    fun findByChar(char: Char): MutableList<Cantonese>

}