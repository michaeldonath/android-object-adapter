/*
 * Copyright (C) 2017 Dimitri Pfaffenrodt
 * Copyright (C) 2014 The Android Open Source Project
 *
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
package de.pfaffenrodt.adapter

/**
 * A PresenterSelector is used to obtain a [Presenter] for a given Object.
 * Similar to [Presenter],  PresenterSelector is stateless.
 */
abstract class PresenterSelector {

    /**
     * Returns an array of all possible presenters.  The returned array should
     * not be modified.
     */
    abstract val presenters: Array<Presenter>

    /**
     * Returns a presenter for the given item.
     */
    abstract fun getPresenter(item: Any): Presenter
}
