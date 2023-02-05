package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* 스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에서 new 하는게 아니고 
 * 특정 어노테이션이 붙어 있는 클래스 파일들을 new해서 스프링 컨테이너가 관리한다.
 * RestController : 반환하는 값을 viewResolver를 거치지 않고 바로 반환한다.
 */
@RestController 
public class BlogControllerTest {
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1> hello Spring boot(스프링 부트 앱!!!)</h1>";
	}

}
