package com.seecent.chat.northapi

import com.seecent.chat.Account
import com.seecent.platform.DateBase
import com.seecent.chat.member.MemberGroup
import com.seecent.platform.status.ApiAccountStatus

class ApiAccount extends DateBase {

    static belongsTo = [account: Account]

    static hasMany = [memberGroups: MemberGroup]

    String name
    String username
    String password
    String appId
    String appSecret
    String phone
    String email
    String description

    ApiAccountStatus  status

    String accessToken
    Long refreshTime
    Long expiresTime

    static constraints = {
        password(nullable: true)
        appId(nullable: true)
        appSecret(nullable: true)
        phone(nullable: true)
        email(nullable: true)
        description(nullable: true)
        accessToken(nullable: true)
        refreshTime(nullable: true)
        expiresTime(nullable: true)
        memberGroups(nullable: true)
    }
}
