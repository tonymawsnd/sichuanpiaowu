package cn.scpw.util;

/**
 * Created with IntelliJ IDEA.
 * User: thinknovo
 * Date: 2019/07/30
 * Description:
 * Version: V1.0
 */
public class AliPayFiled {
    // 创建的应用ID
    public static final String APP_ID = "2016101000649011";
    // 自己APP的私钥
    public static final String MKEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC8gpr0f13/+0KHjWlqshGy4Av7yPaQ61Of4hGqb59DgHL3c/+HBYXUrR8iap7vnw0by7NteeiLQfaUOxxni3gmJEn+bLV3YtWKdTza3ectWLZJNbJ6yblEimqi8Ix/sGfJb+9kIm7eSIp8jank3Lrnywk8uDFVsaBMXjjK71kmGC6nwcIFPeLB7L008MVdBjllk5WSDvgmL02oSFZroFlPmnZ7hXBq9uV/gdkFcVHv7xVCxBD97zqRhnGAxQo+GpHUfLqCB471lZogqOheImmL+CZ2xf4v6HkQw5voSFieVmfACej/q6zA+gidVJ4qXGzQk9O5a0S6iQ4M/thYBfvzAgMBAAECggEBAJWivsnRyJYHprnfAIzXKMFqo1iMH1zN0CWb2BYIYM2+SoQuqelN8vvtKEezhtIC2O71dUozeOoBxG/JtDRlO0xbhfjV5f4MkCFGCrZZasZOIvReEXzyX4QOs7L/ayd4qgn2Nnqv8n2z62oPMYsfw6V3P6/ZLiAtzWaRbFd6QrO/I87tCsrzG8FxtyCxkSJFjRBGmi9lS8//AvD4QYrwNbaeEUJlVXTeqkPsT7gNQai9wDFcEyMzYnqEulcK39b23p8Daj86t0VC/A5K8/zXVxM60pNQuFAe3t0ig8GtRXHpfMxauBV9C+A3cIuBfZA7vpwydnG8JwNqiwdE7dZMY/ECgYEA8wy+/JLYQYsK3hcbRCDfReDg3ChzysrALUFwWneb8CxY50OUMYXnEiy7B9Yih6h6jnEPGJbcdNiGwiDHPVYKM7hKCd3B8coqKVrLcivAToVUPU+MRp5kCAxV29Tggg/8RllDrIMPo0hRlXH2ts3PVweMd80sIdcjsBPvIyhQur8CgYEAxo3tN/zsaY4iV/bdu8usrXlId8a7zqk4m2/BMAf32V8n0DuAk0dsDJdLMZNROPjUlvbjfa+5bagxS1eUk0rTJwjyZ+BuaBJ6lLMhfPgXqUJzV2wVX1c3qMWrXdoPpfrii/ssnEmkYtmdZMGOLuyK9wT9n0fLO7tIPhDrJi+gz80CgYAllTT7LWHPUMbPbNdEg6jCz3E12fN9yjhJRzMuagxs6Q6eRC7oMYJ3pv8MySnxvDWnTQg+jyVr1AeSgSsN6v4M3VRljirtTouSdX28G9PS0H8kM+bHDLr/G5kzMwm8Uuh5oFf8lw+V+hrTdxnlTpHfLUWlSM6oNPJJyetSjmtdVQKBgAN4098YwyGNZLhZDsOL6jcWWdgOV5ZjiyPcrmoimYjpiw6vG653n0IRGzWAt/jhEQaaxpuaCQoL2ODSZTy2ID8cfvCmEggr2ozjHQDMbc195fpvX2hNZCHFYxu/BmsGmhOMjtkkyIUZ/RCX+d6EMGHlanHwlXMz8S10qkf+qTc5AoGBAOWKbAPLk2jGRjj+LMSqTrnEDPrS7pjO4V9DsW8mRjUthyE3KhD7RSm4oLFm0PILQkhEuEs/RO9FsI1I1lhE9CleO+9GnI01C5nbDk27gbtyflCC5St/kfcyroestanYXRUpamb9oLvyZnKG/co6mgfFxnPjWui+LeV7vBUeB1JU";
    // 支付宝的公钥(使用自己APP的公钥兑换)
    public static final String AKEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmHay6QW14A0MFlSbUtDQXVvjdqOWpgjAmTyv7PWcnMvyHMJNWWky/44TR/CCcZM8lgDGw4+brbQOhBW9E9DgFzVeDdTU2hl8j7pMHe0WSBQFcZ52/4cszO8U4WrEGMbr6n/Oi5gkPSBBrhBZG46yF8Wc9ssEUYKnBC4YtO80fytuXCs1B1wBaysd6xxvYhOK5903y2UkukcDdA4J8eYvQQDddjrGskkbJNP8wSUF8OZRZlrO2BZkVYwfsW9kiHWgMjcx/qCkcHxUIJVhnAce1wMz1qHG1yvD/E9TFVriYMopiIqDX7RPWECXHaNSMGM6Go3bOCliwGBcj/qZ96A9xQIDAQAB";
    // 阿里支付测试接口
    public static final String ALI_PAY_DEV_URL = "https://openapi.alipaydev.com/gateway.do";
    // 阿里支付正式接口
//    public static final String aliPayURL = "https://openapi.alipay.com/gateway.do";
    // 代表扫码支付
    public static final String FAST_INSTANT_TRADE_PAY = "FAST_INSTANT_TRADE_PAY";


}
