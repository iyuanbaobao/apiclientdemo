package com.iyuanbaobao.recruit.media.apiclient;

import java.util.Date;

import org.junit.Test;

import com.iyuanbaobao.recruit.media.apiclient.bean.AiInviteReq;
import com.iyuanbaobao.recruit.media.apiclient.bean.ApiClientConfig;
import com.iyuanbaobao.recruit.media.apiclient.exception.ApiException;
import com.iyuanbaobao.recruit.media.apiclient.utils.Json;


public class ApiClientDemo {

	
	String apiKey="xxxxxxxxxxxxxxxxx";
	String apiSecret="xxxxxxxxxxxxxx";
	/**
	 * ai邀请码邀请
	 * 
	 * @throws ApiException
	 */
	@Test
	public void aiInvite() throws ApiException {

		AiInviteReq aiInviteReq=new AiInviteReq();
		aiInviteReq.setBeginTime(new Date());
		aiInviteReq.setCorpName("xxx");
		aiInviteReq.setEndTime(new Date());
		aiInviteReq.setExamPaperId("5e9ea39fe4b0d5a163baf2ea");
		aiInviteReq.setInterviewerMobile("13650890511");
		aiInviteReq.setInterviewerName("li");
		aiInviteReq.setPositionDescription("xxx");
		aiInviteReq.setPositionName("java");
		ApiClientConfig apiClientConfig=new ApiClientConfig();
		apiClientConfig.setApiKey(apiKey);
		apiClientConfig.setApiSecret(apiSecret);
		
		InterviewRecord interviewRecord=new InterviewRecord(apiClientConfig);
		System.out.println(Json.toJSON(interviewRecord.aiInvite(aiInviteReq)));
	}
}
