package com.devopsbuddy;

import com.devopsbuddy.web.i18n.I18NService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DevopsbuddyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocalService() throws Exception {

		String expectResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected String don't match", expectResult,actual);

	}



}
