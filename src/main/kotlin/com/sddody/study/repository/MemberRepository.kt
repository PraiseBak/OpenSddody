package com.sddody.study.repository

import com.sddody.study.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MemberRepository : JpaRepository<Member,Long>{

    fun findByNickname(nickname : String) : Optional<Member>;
}
