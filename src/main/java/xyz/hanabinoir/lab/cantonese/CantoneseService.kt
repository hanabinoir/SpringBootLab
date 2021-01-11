package xyz.hanabinoir.lab.cantonese

import org.springframework.stereotype.Service

@Service
class CantoneseService(private val repository: CantoneseRepository) {
    fun findBySpelling(spelling: String): List<Cantonese> {
        val chars = repository.findByJyutping(spelling)
        chars += repository.findByJyutpingContains(spelling)
        chars += repository.findByYale(spelling)
        chars += repository.findByYaleContains(spelling)
        return chars.distinctBy { it.code to it.jyutping }
    }

    fun findByChar(char: Char): List<Cantonese> = repository.findByChar(char)

    fun findJyutping(char: Char): List<String>
            = repository.findByChar(char).map { it.jyutping }

    fun findYale(char: Char): List<String>
            = repository.findByChar(char).map { it.yale }
}