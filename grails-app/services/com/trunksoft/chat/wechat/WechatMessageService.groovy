package com.trunksoft.chat.wechat

import com.trunksoft.chat.message.ImageMessage
import com.trunksoft.chat.message.MusicMessage
import com.trunksoft.chat.message.NewsMessage
import com.trunksoft.chat.message.TextMessage
import com.trunksoft.chat.message.VideoMessage
import com.trunksoft.chat.message.VoiceMessage
import com.trunksoft.chat.message.TemplateMessage
import com.trunksoft.chat.services.ChatMessageService
import com.trunksoft.chat.services.MessageResult
import com.trunksoft.chat.services.exception.ApiErrorException
import com.trunksoft.chat.status.ChatMessageStatus
import com.trunksoft.chat.Account
import com.trunksoft.chat.util.ChatMessageUtil

class WechatMessageService implements ChatMessageService {

    static transactional =  false

    def wechatAccountService

    @Override
    MessageResult send(Account account, TextMessage msg) throws ApiErrorException {
        log.info(" send TextMessage account[${account.name}]".toString())
        wechatAccountService.refreshAccessToken(account)
        withRest(url: account.apiUrl) {
            def params = [access_token: account.refreshToken]
            def response = post(path: '/message/custom/send', query: params) {
                type "application/json"
                text ChatMessageUtil.toJson(msg)
            }
            msg.status = ChatMessageStatus.SENDED
            def json = response.json
            log.info(" send TextMessage toUser: " + msg.toUser.id + ", content: " + msg.content + ", json: " + json)
            if(json){
                def result = MessageResult.create(json.msgid, json.errcode, json.errmsg)
                msg.bindResult(result)
                return result
            }
            else {
                return new MessageResult(null, -1, "failure")
            }
        }
    }

    @Override
    MessageResult send(Account account, ImageMessage msg) throws ApiErrorException {
        log.info(" send ImageMessage account[${account.name}]".toString())
        wechatAccountService.refreshAccessToken(account)
        withRest(url: account.apiUrl) {
            def params = [access_token: account.refreshToken]
            def response = post(path: '/message/custom/send', query: params) {
                type "application/json"
                text ChatMessageUtil.toJson(msg)
            }
            msg.status = ChatMessageStatus.SENDED
            def json = response.json
            log.info(" send ImageMessage toUser: " + msg.toUser.id + ", mediaId: " + msg.mediaId + ", json: " + json)
            if(json){
                def result = MessageResult.create(json.msgid, json.errcode, json.errmsg)
                msg.bindResult(result)
                return result
            }
            else {
                return new MessageResult(null, -1, "failure")
            }
        }
    }

    @Override
    MessageResult send(Account account, VoiceMessage msg) throws ApiErrorException {
        log.info(" send VoiceMessage account[${account.name}]".toString())
        wechatAccountService.refreshAccessToken(account)
        withRest(url: account.apiUrl) {
            def params = [access_token: account.refreshToken]
            def response = post(path: '/message/custom/send', query: params) {
                type "application/json"
                text ChatMessageUtil.toJson(msg)
            }
            msg.status = ChatMessageStatus.SENDED
            def json = response.json
            log.info(" send VoiceMessage toUser: " + msg.toUser.id + ", mediaId: " + msg.mediaId + ", json: " + json)
            if(json){
                def result = MessageResult.create(json.msgid, json.errcode, json.errmsg)
                msg.bindResult(result)
                return result
            }
            else {
                return new MessageResult(null, -1, "failure")
            }
        }
    }

    @Override
    MessageResult send(Account account, VideoMessage msg) throws ApiErrorException {
        log.info(" send VideoMessage account[${account.name}]".toString())
        wechatAccountService.refreshAccessToken(account)
        withRest(url: account.apiUrl) {
            def params = [access_token: account.refreshToken]
            def response = post(path: '/message/custom/send', query: params) {
                type "application/json"
                text ChatMessageUtil.toJson(msg)
            }
            msg.status = ChatMessageStatus.SENDED
            def json = response.json
            log.info(" send VideoMessage toUser: " + msg.toUser.id + ", mediaId: " + msg.mediaId + ", json: " + json)
            if(json){
                def result = MessageResult.create(json.msgid, json.errcode, json.errmsg)
                msg.bindResult(result)
                return result
            }
            else {
                return new MessageResult(null, -1, "failure")
            }
        }
    }

    @Override
    MessageResult send(Account account, MusicMessage msg) throws ApiErrorException {
        log.info(" send MusicMessage account[${account.name}]".toString())
        wechatAccountService.refreshAccessToken(account)
        withRest(url: account.apiUrl) {
            def params = [access_token: account.refreshToken]
            def response = post(path: '/message/custom/send', query: params) {
                type "application/json"
                text ChatMessageUtil.toJson(msg)
            }
            msg.status = ChatMessageStatus.SENDED
            def json = response.json
            log.info(" send MusicMessage toUser: " + msg.toUser.id + ", thumbMediaId: " + msg.thumbMediaId + ", json: " + json)
            if(json){
                def result = MessageResult.create(json.msgid, json.errcode, json.errmsg)
                msg.bindResult(result)
                return result
            }
            else {
                return new MessageResult(null, -1, "failure")
            }
        }
    }

    @Override
    MessageResult send(Account account, NewsMessage msg) throws ApiErrorException {
        log.info(" send NewsMessage account[${account.name}]".toString())
        wechatAccountService.refreshAccessToken(account)
        withRest(url: account.apiUrl) {
            def params = [access_token: account.refreshToken]
            def response = post(path: '/message/custom/send', query: params) {
                type "application/json"
                text ChatMessageUtil.toJson(msg)
            }
            msg.status = ChatMessageStatus.SENDED
            def json = response.json
            log.info(" send NewsMessage toUser: " + msg.toUser.id + ", json: " + json)
            if(json){
                def result = MessageResult.create(json.msgid, json.errcode, json.errmsg)
                msg.bindResult(result)
                return result
            }
            else {
                return new MessageResult(null, -1, "failure")
            }
        }
    }

    @Override
    MessageResult send(Account account, TemplateMessage msg) throws ApiErrorException {
        log.info(" send TemplateMessage account[${account.name}]".toString())
        wechatAccountService.refreshAccessToken(account)
        withRest(url: account.apiUrl) {
            def params = [access_token: account.refreshToken]
            def response = post(path: '/message/template/send', query: params) {
                type "application/json"
                text ChatMessageUtil.toJson(msg)
            }
            msg.status = ChatMessageStatus.SENDED
            def json = response.json
            log.info(" send TemplateMessage toUser: " + msg.toUser.id + ", templateId: " + msg.templateId + ", data: " + msg.data.toString() + ", json: " + json)
            if(json){
                def result = MessageResult.create(json.msgid, json.errcode, json.errmsg)
                msg.bindResult(result)
                return result
            }
            else {
                return new MessageResult(null, -1, "failure")
            }
        }
    }

}
