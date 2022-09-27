package co.com.choucair.academy.questions;

import co.com.choucair.academy.userinterface.UtestLoginPage4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class SelectImageCAPTCHA implements Question<Boolean> {
    public SelectImageCAPTCHA() { }
    public static Question<Boolean> isVisible() {
        return new SelectImageCAPTCHA();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean isVisibleSelectImageCaptcha = Visibility.of(UtestLoginPage4.SELECT_IMAGE_CAPTCHA).answeredBy(actor);
        boolean isVisibleUserExistAlert = Visibility.of(UtestLoginPage4.USER_EXIST_ALERT).answeredBy(actor);
        return isVisibleSelectImageCaptcha || isVisibleUserExistAlert;
    }
}
