package com.flutterwave.raveandroid.di.components;

import com.flutterwave.raveandroid.RavePayActivity;
import com.flutterwave.raveandroid.WebFragment;
import com.flutterwave.raveandroid.data.EventLogger;
import com.flutterwave.raveandroid.data.NetworkRequestImpl;
import com.flutterwave.raveandroid.di.modules.AccountModule;
import com.flutterwave.raveandroid.di.modules.AchModule;
import com.flutterwave.raveandroid.di.modules.AndroidModule;
import com.flutterwave.raveandroid.di.modules.BankTransferModule;
import com.flutterwave.raveandroid.di.modules.BarterModule;
import com.flutterwave.raveandroid.di.modules.CardModule;
import com.flutterwave.raveandroid.di.modules.EventLoggerModule;
import com.flutterwave.raveandroid.di.modules.FrancModule;
import com.flutterwave.raveandroid.di.modules.GhanaModule;
import com.flutterwave.raveandroid.di.modules.MpesaModule;
import com.flutterwave.raveandroid.di.modules.NetworkModule;
import com.flutterwave.raveandroid.di.modules.RwandaModule;
import com.flutterwave.raveandroid.di.modules.UgandaModule;
import com.flutterwave.raveandroid.di.modules.UkModule;
import com.flutterwave.raveandroid.di.modules.UssdModule;
import com.flutterwave.raveandroid.di.modules.WebModule;
import com.flutterwave.raveandroid.di.modules.ZambiaModule;
import com.flutterwave.raveandroid.verification.AVSVBVFragment;
import com.flutterwave.raveandroid.verification.OTPFragment;
import com.flutterwave.raveandroid.verification.PinFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AndroidModule.class, NetworkModule.class, EventLoggerModule.class})
public interface AppComponent {

    NetworkRequestImpl networkImpl();

    EventLogger eventLogger();

    void inject(RavePayActivity ravePayActivity);

    void inject(AVSVBVFragment avsvbvFragment);

    void inject(OTPFragment otpFragment);

    void inject(PinFragment pinFragment);

    void inject(WebFragment webFragment);

    MpesaComponent plus(MpesaModule mpesaModule);

    UgandaComponent plus(UgandaModule ugandaModule);

    RwandaComponent plus(RwandaModule rwandaModule);

    GhanaComponent plus(GhanaModule ghanaModule);

    ZambiaComponent plus(ZambiaModule zambiaModule);

    CardComponent plus(CardModule cardModule);

    BankTransferComponent plus(BankTransferModule bankTransferModule);

    UssdComponent plus(UssdModule ussdModule);

    AccountComponent plus(AccountModule accountModule);

    AchComponent plus(AchModule achModule);

    UkComponent plus(UkModule ukModule);

    BarterComponent plus(BarterModule barterModule);

    WebComponent plus(WebModule webModule);

    FrancComponent plus(FrancModule francModule);
}

