/*
 * Copyright 2018 Bakumon. https://github.com/Bakumon
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.bakumon.moneykeeper.ui.settings.other

import androidx.fragment.app.Fragment
import me.bakumon.moneykeeper.R
import me.bakumon.moneykeeper.ui.common.BaseFragmentActivity

class OtherSettingsActivity : BaseFragmentActivity() {
    override fun setTitle(): String {
        return getString(R.string.text_other_setting)
    }

    override fun setFragment(): Fragment {
        return OtherSettingsFragment.newInstance()
    }
}
