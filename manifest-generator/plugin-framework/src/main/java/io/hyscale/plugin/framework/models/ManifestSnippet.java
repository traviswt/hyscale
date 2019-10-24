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
package io.hyscale.plugin.framework.models;

import javax.validation.constraints.NotNull;

/**
 *
 */
public class ManifestSnippet {

	/**
	 * snippet : should be yaml formatted string
	 */
	private String snippet;
	private String kind;
	private String path;
	private String name;
	private SnippetType type;

	@NotNull
	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	@NotNull
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@NotNull
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public SnippetType getType() {
		return type != null ? type : SnippetType.JSON;
	}

	public void setType(SnippetType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public enum SnippetType {
		JSON, YAML;
	}

	@Override
	public String toString() {
		return "ManifestSnippet{" + "kind='" + kind + '\'' + ", path='" + path + '\'' + ", name='" + name + '\''
				+ ", type=" + type + '}';
	}
}
