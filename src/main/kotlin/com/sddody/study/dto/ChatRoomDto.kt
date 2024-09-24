package com.sddody.study.dto

import java.util.HashMap

class ChatRoomDto(
    var id: Long,

    var studyId : Long,

    var studyName : String,

    var studyMemberNum : Int,

    var notReadMsgNum : Int,

    var isChatOver : Boolean = false,

    var chatRoomMemberInfoDtoList : List<MemberInfoDto> = listOf(),

    var chatRoomUsernameProfileSrcMap : MutableMap<String,String>? = mutableMapOf(),

    var recentMsg : String = "",

    var chatReadMap : MutableMap<Long,Long>? = HashMap()

){
}