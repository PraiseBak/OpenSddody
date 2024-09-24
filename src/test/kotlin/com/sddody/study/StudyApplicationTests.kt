package com.sddody.study

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.io.FileInputStream

@SpringBootTest
class StudyApplicationTests {

	@Test
	fun contextLoads() {
		// Firebase 초기화 코드 추가
		if (FirebaseApp.getApps().isEmpty()) {
			initFirebase()
		}
	}

	fun initFirebase() {
		//보안상 이유로 삭제
		val serviceAccount = FileInputStream("")
		val options: FirebaseOptions = FirebaseOptions.Builder()
			.setCredentials(GoogleCredentials.fromStream(serviceAccount))
			.build()
		FirebaseApp.initializeApp(options)
	}
}