/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-21 at 20:17:13 UTC 
 * Modify at your own risk.
 */

package com.appspot.ocr_backend.backend.model;

/**
 * Message asking for Bills that meet certain criteria account_number: (String) status: status of
 * the bill ('Paid', 'Unpaid')
 * <p/>
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the backend. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagesGetBills extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key("account_number")
    private java.lang.String accountNumber;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String status;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber accountNumber or {@code null} for none
     */
    public MessagesGetBills setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getStatus() {
        return status;
    }

    /**
     * @param status status or {@code null} for none
     */
    public MessagesGetBills setStatus(java.lang.String status) {
        this.status = status;
        return this;
    }

    @Override
    public MessagesGetBills set(String fieldName, Object value) {
        return (MessagesGetBills) super.set(fieldName, value);
    }

    @Override
    public MessagesGetBills clone() {
        return (MessagesGetBills) super.clone();
    }

}
