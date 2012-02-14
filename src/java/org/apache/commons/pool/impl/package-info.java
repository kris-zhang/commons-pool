/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * <p>
 * Object pooling API implementations.
 * </p>
 * <p>
 * {@link org.apache.commons.pool.impl.StackObjectPool StackObjectPool} (
 * {@link org.apache.commons.pool.impl.StackKeyedObjectPool StackKeyedObjectPool}) provides a simple,
 * {@link java.util.Stack Stack}-based implementation of {@link org.apache.commons.pool.ObjectPool ObjectPool} (
 * {@link org.apache.commons.pool.KeyedObjectPool KeyedObjectPool}).
 * {@link org.apache.commons.pool.impl.StackObjectPoolFactory StackObjectPoolFactory} (
 * {@link org.apache.commons.pool.impl.StackKeyedObjectPoolFactory StackKeyedObjectPoolFactory}) provides an
 * implementation of the {@link org.apache.commons.pool.ObjectPoolFactory ObjectPoolFactory} (
 * {@link org.apache.commons.pool.KeyedObjectPoolFactory KeyedObjectPoolFactory}) factory interface for this class.
 * </p>
 * <p>
 * {@link org.apache.commons.pool.impl.GenericObjectPool GenericObjectPool} (
 * {@link org.apache.commons.pool.impl.GenericKeyedObjectPool GenericKeyedObjectPool}) provides a more robust (but also
 * more complicated) implementation of {@link org.apache.commons.pool.ObjectPool ObjectPool} (
 * {@link org.apache.commons.pool.KeyedObjectPool KeyedObjectPool}).
 * {@link org.apache.commons.pool.impl.GenericObjectPoolFactory GenericObjectPoolFactory} (
 * {@link org.apache.commons.pool.impl.GenericKeyedObjectPoolFactory GenericKeyedObjectPoolFactory}) provides an
 * implementation of the {@link org.apache.commons.pool.ObjectPoolFactory ObjectPoolFactory} (
 * {@link org.apache.commons.pool.KeyedObjectPoolFactory KeyedObjectPoolFactory}) factory interface for this class.
 * </p>
 * <p>
 * See also the {@link org.apache.commons.pool} package.
 * </p>
 * @version $Id$
 */
package org.apache.commons.pool.impl;

