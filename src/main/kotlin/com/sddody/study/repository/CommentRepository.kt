package com.sddody.study.repository

import com.sddody.study.entity.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository : JpaRepository<Comment,Long>{


}
