package com.example.app.member;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Execute;
import com.example.app.Result;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class JoinSMSController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		Result result = new Result();

		BufferedReader reader = request.getReader();
		String line = reader.readLine();
		JsonElement jsonElement = JsonParser.parseString(line);
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		String phoneNumber = jsonObject.get("phoneNumber").getAsString();

		SmsService smsService = new SmsService();

		try {
			// SMS 전송, 인증코드 생성
			String verificationCode = smsService.sendVerificationSms(phoneNumber);

			// 세션에 인증코드 저장
			HttpSession session = request.getSession();
			session.setAttribute("verificationCode", verificationCode);
		} catch (CoolsmsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.getMessage();
		}

		return result;
	}

}
