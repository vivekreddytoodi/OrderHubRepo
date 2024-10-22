/*
package applicationrunner;

import applicationrunner.security.SecurityConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest (classes = OrderHubApplication.class)
@Import(SecurityConfig.class)
class OrderHubApplicationTest {

	@Autowired
	private SecurityConfig securityConfig;

	@Autowired
	private UserDetailsService userDetailsService;

	@Test
	void contextLoads() {
	}


	@Test
	public void testPasswordEncoder() {
		PasswordEncoder encoder = securityConfig.passwordEncoder();
		String rawPassword = "password123";
		String encodedPassword = encoder.encode(rawPassword);

		assertTrue(encoder.matches(rawPassword, encodedPassword));
	}

	@Test
	public void testUserDetailsService() {
		UserDetails user = userDetailsService.loadUserByUsername("testuser");
		assertNotNull(user);
		assertEquals("testuser", user.getUsername());
	}


}*/
