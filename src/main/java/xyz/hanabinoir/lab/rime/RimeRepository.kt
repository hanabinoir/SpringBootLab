package xyz.hanabinoir.lab.rime

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RimeRepository: JpaRepository<Rime, Int> {
    fun findByCharactersContains(character: String): List<Rime>
}