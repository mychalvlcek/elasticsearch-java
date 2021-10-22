/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.text_structure;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the text_structure namespace.
 */
public class ElasticsearchTextStructureAsyncClient extends ApiClient<ElasticsearchTextStructureAsyncClient> {

	public ElasticsearchTextStructureAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchTextStructureAsyncClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchTextStructureAsyncClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchTextStructureAsyncClient(this.transport, transportOptions);
	}

	// ----- Endpoint: text_structure.find_structure

	/**
	 * Finds the structure of a text file. The text file must contain data that is
	 * suitable to be ingested into Elasticsearch.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/find-structure.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TJsonDocument> CompletableFuture<FindStructureResponse> findStructure(
			FindStructureRequest<TJsonDocument> request) throws IOException, ElasticsearchException {
		return this.transport.performRequestAsync(request, FindStructureRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Finds the structure of a text file. The text file must contain data that is
	 * suitable to be ingested into Elasticsearch.
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link FindStructureRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/find-structure.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TJsonDocument> CompletableFuture<FindStructureResponse> findStructure(
			Function<FindStructureRequest.Builder<TJsonDocument>, ObjectBuilder<FindStructureRequest<TJsonDocument>>> fn)
			throws IOException, ElasticsearchException {
		return findStructure(fn.apply(new FindStructureRequest.Builder<TJsonDocument>()).build());
	}

}
