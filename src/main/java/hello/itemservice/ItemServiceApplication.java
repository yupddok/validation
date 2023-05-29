package hello.itemservice;

import hello.itemservice.web.validation.ItemValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	// 글로벌 Validator 설정 - 모든 컨트롤러에 다 적용
	// 글로벌 설정을 직접 설정하는 경우는 드물다.
//	@Override
//	public Validator getValidator() {
//		return new ItemValidator();
//	}
}
