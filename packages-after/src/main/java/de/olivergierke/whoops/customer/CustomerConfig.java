/*
 * Copyright 2011-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.olivergierke.whoops.customer;

import static de.olivergierke.whoops.ApplicationConfiguration.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Configuration creating mock components of repository instances.
 * 
 * @author Oliver Gierke
 */
@Configuration
public class CustomerConfig {

	@Bean
	public CustomerRepository customerRepository() {

		CustomerRepository repository = mock(CustomerRepository.class);
		when(repository.save(any(Customer.class))).thenAnswer(withArgument());
		return repository;
	}
}
