package com.nodlee.theogony;

import com.nodlee.theogony.task.DragonDataWatcherTest;
import com.nodlee.theogony.thirdparty.gson.SpellDeserializerTest;
import com.nodlee.theogony.ui.activity.WelcomeToSummonerRiftTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 作者：nodlee
 * 时间：2017/3/20
 * 说明：
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        RiotGameUtilsTest.class
//        WelcomeToSummonerRiftTest.class,
//        DragonDataWatcherTest.class
          SpellDeserializerTest.class
})
public class TestSuite {
}
