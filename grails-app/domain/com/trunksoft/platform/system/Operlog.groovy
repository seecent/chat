package com.trunksoft.platform.system
import com.trunksoft.chat.Account
import com.trunksoft.platform.auth.User
import com.trunksoft.platform.type.OperResult
import com.trunksoft.platform.type.OperType
import com.trunksoft.platform.CreateBase

class Operlog extends CreateBase {

    Date opertime
    String detail
    String ip
    Menu menu
    String category
    String source
    OperType type
    OperResult result

    User user
    Account account

    static constraints = {
        account(nullable: true)
        ip(nullable: true)
        user(nullable: true)
        detail(length: 2000)
    }

    static mapping = {
        version(false)
        type enumType: 'ordinal'
        result enumType: 'ordinal'
    }

}
