package xyz.hanabinoir.lab.profile

import java.sql.Clob
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "profile")
data class Profile(
    @Id
    val id: String,
    val intro: Clob,
    val title: String,
    @Column(name = "first_name")
    val firstName: String,
    @Column(name = "middle_name", nullable = true)
    val middleName: String? = null,
    @Column(name = "last_name")
    val lastName: String,
    @Column(name = "last_name_jp", nullable = true)
    val lastNameJp: String? = null,
    @Column(name = "first_name_jp", nullable = true)
    val firstNameJp: String? = null,
    val resumeJp: String,
    val cvJp: String,
    val resume: String,
    val photo: String
)


