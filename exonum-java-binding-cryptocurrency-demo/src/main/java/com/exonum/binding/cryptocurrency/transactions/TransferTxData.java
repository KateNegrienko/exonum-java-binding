/*
 * Copyright 2018 The Exonum Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.exonum.binding.cryptocurrency.transactions;

import com.exonum.binding.common.crypto.PublicKey;
import com.google.common.base.Objects;

class TransferTxData {
  final long seed;
  final PublicKey senderId;
  final PublicKey recipientId;
  final long amount;

  TransferTxData(long seed, PublicKey senderId, PublicKey recipientId, long amount) {
    this.seed = seed;
    this.senderId = senderId;
    this.recipientId = recipientId;
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferTxData that = (TransferTxData) o;
    return seed == that.seed
        && amount == that.amount
        && Objects.equal(senderId, that.senderId)
        && Objects.equal(recipientId, that.recipientId);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(seed, senderId, recipientId, amount);
  }
}
