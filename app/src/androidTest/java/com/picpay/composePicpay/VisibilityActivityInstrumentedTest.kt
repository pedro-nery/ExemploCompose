package com.picpay.composePicpay

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import com.picpay.composePicpay.activity.VisibilityActivityContent
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class VisibilityActivityInstrumentedTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setupContent(){
        composeTestRule.setContent {
            VisibilityActivityContent()
        }
    }

    @Test
    fun testButtonClick(){
        val button = composeTestRule.onNode(hasTestTag("visibilityButton"))
        val text = composeTestRule.onNode(hasTestTag("visibilityText"))
        button.performClick()
        text.assertIsDisplayed()
    }

}