package com.seecent.chat.services.job

import com.seecent.chat.Account
import com.seecent.chat.member.MemberStatService
import com.seecent.chat.status.AccountStatus
import groovyx.gpars.GParsPool
import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.quartz.QuartzJobBean

class MemberDayStatJob extends QuartzJobBean {
    Logger logger = LoggerFactory.getLogger(MemberDayStatJob)

    MemberStatService memberStatService

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        logger.info("Member Day stat start context:${context}")
        GParsPool.withPool {
            Account.findAllByStatus(AccountStatus.ACTIVATE).eachParallel { Account account ->
                try {
                    memberStatService.executeDayStat(account)
                } catch (e) {
                    log.error(e.message, e)
                }
            }
        }
    }
}