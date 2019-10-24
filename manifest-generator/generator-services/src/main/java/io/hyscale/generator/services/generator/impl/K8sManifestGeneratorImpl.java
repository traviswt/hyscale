/**
 * Copyright 2019 Pramati Prism, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hyscale.generator.services.generator.impl;

import java.util.List;

import io.hyscale.generator.services.generator.ManifestGenerator;
import io.hyscale.generator.services.processor.PluginProcessor;
import io.hyscale.servicespec.commons.model.service.ServiceSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.hyscale.commons.exception.HyscaleException;
import io.hyscale.commons.models.Manifest;
import io.hyscale.commons.models.ManifestContext;

@Component
public class K8sManifestGeneratorImpl implements ManifestGenerator {

	@Autowired
	private PluginProcessor pluginProcessor;

	@Override
	public List<Manifest> generate(ServiceSpec serviceSpec, ManifestContext context) throws HyscaleException {

		return pluginProcessor.getManifests(serviceSpec, context);
	}
}
