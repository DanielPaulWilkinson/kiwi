// Generated by Dagger (https://dagger.dev).
package com.example.zest.fragment.createMealJourney;

import com.example.zest.services.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class mealMethodFragment_MembersInjector implements MembersInjector<mealMethodFragment> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public mealMethodFragment_MembersInjector(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static MembersInjector<mealMethodFragment> create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new mealMethodFragment_MembersInjector(sharedPreferencesProvider);
  }

  @Override
  public void injectMembers(mealMethodFragment instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.example.zest.fragment.createMealJourney.mealMethodFragment.sharedPreferences")
  public static void injectSharedPreferences(mealMethodFragment instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
