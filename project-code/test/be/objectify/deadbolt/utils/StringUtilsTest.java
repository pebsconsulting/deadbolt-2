/*
 * Copyright 2012 Steve Chaloner
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
package be.objectify.deadbolt.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Steve Chaloner (steve@objectify.be)
 */
public class StringUtilsTest
{
    @Test
    public void isEmpty_null()
    {
        Assert.assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    public void isEmpty_zeroLength()
    {
        Assert.assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void isEmpty_spaces()
    {
        Assert.assertTrue(StringUtils.isEmpty("    "));
    }

    @Test
    public void isEmpty_npc()
    {
        Assert.assertTrue(StringUtils.isEmpty("\t\n\r"));
    }
}
