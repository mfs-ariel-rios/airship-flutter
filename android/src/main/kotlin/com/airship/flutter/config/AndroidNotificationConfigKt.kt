//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: config.proto

package com.airship.flutter.config;

@kotlin.jvm.JvmSynthetic
public inline fun androidNotificationConfig(block: com.airship.flutter.config.AndroidNotificationConfigKt.Dsl.() -> kotlin.Unit): com.airship.flutter.config.Config.AndroidNotificationConfig =
  com.airship.flutter.config.AndroidNotificationConfigKt.Dsl._create(com.airship.flutter.config.Config.AndroidNotificationConfig.newBuilder()).apply { block() }._build()
public object AndroidNotificationConfigKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.airship.flutter.config.Config.AndroidNotificationConfig.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.airship.flutter.config.Config.AndroidNotificationConfig.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.airship.flutter.config.Config.AndroidNotificationConfig = _builder.build()

    /**
     * <pre>
     *&#47; The icon resource name.
     * </pre>
     *
     * <code>string icon = 1;</code>
     */
    public var icon: kotlin.String
      @JvmName("getIcon")
      get() = _builder.getIcon()
      @JvmName("setIcon")
      set(value) {
        _builder.setIcon(value)
      }
    /**
     * <pre>
     *&#47; The icon resource name.
     * </pre>
     *
     * <code>string icon = 1;</code>
     */
    public fun clearIcon() {
      _builder.clearIcon()
    }

    /**
     * <pre>
     *&#47; The large icon resource name.
     * </pre>
     *
     * <code>string large_icon = 2;</code>
     */
    public var largeIcon: kotlin.String
      @JvmName("getLargeIcon")
      get() = _builder.getLargeIcon()
      @JvmName("setLargeIcon")
      set(value) {
        _builder.setLargeIcon(value)
      }
    /**
     * <pre>
     *&#47; The large icon resource name.
     * </pre>
     *
     * <code>string large_icon = 2;</code>
     */
    public fun clearLargeIcon() {
      _builder.clearLargeIcon()
    }

    /**
     * <pre>
     *&#47; The accent color.
     * / Must be a hex value #AARRGGBB.
     * / Provide it as Color in flutter
     * </pre>
     *
     * <code>string accent_color = 3;</code>
     */
    public var accentColor: kotlin.String
      @JvmName("getAccentColor")
      get() = _builder.getAccentColor()
      @JvmName("setAccentColor")
      set(value) {
        _builder.setAccentColor(value)
      }
    /**
     * <pre>
     *&#47; The accent color.
     * / Must be a hex value #AARRGGBB.
     * / Provide it as Color in flutter
     * </pre>
     *
     * <code>string accent_color = 3;</code>
     */
    public fun clearAccentColor() {
      _builder.clearAccentColor()
    }

    /**
     * <pre>
     *&#47; The default android notification channel ID.
     * </pre>
     *
     * <code>string default_channel_id = 4;</code>
     */
    public var defaultChannelId: kotlin.String
      @JvmName("getDefaultChannelId")
      get() = _builder.getDefaultChannelId()
      @JvmName("setDefaultChannelId")
      set(value) {
        _builder.setDefaultChannelId(value)
      }
    /**
     * <pre>
     *&#47; The default android notification channel ID.
     * </pre>
     *
     * <code>string default_channel_id = 4;</code>
     */
    public fun clearDefaultChannelId() {
      _builder.clearDefaultChannelId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.airship.flutter.config.Config.AndroidNotificationConfig.copy(block: com.airship.flutter.config.AndroidNotificationConfigKt.Dsl.() -> kotlin.Unit): com.airship.flutter.config.Config.AndroidNotificationConfig =
  com.airship.flutter.config.AndroidNotificationConfigKt.Dsl._create(this.toBuilder()).apply { block() }._build()
