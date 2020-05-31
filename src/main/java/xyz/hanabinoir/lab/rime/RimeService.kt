package xyz.hanabinoir.lab.rime

import org.springframework.stereotype.Service

@Service
class RimeService(private val repository: RimeRepository) {
    fun findRimes(character: String) = repository.findByCharactersContains(character)
}