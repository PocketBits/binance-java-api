package com.binance.api.client.config;

/**
 * Configuration used for Binance operations.
 */
public class BinanceApiConfig {

	/**
	 * Base domain for URLs.
	 */
	private static String BASE_DOMAIN = "binance.com";

    /**
     * Spot Test Network URL.
     */
    private static final String TESTNET_DOMAIN = "testnet.binance.vision";

    /**
     * Binance Spot Test Network option:
     * true if endpoint is spot test network URL; false if endpoint is production spot API URL.
     */
    public static boolean useTestnet;

    /**
     * Binance Spot Test Network option:
     * true for websocket streaming; false for no streaming.
     */
    public static boolean useTestnetStreaming;

	/**
	 * Set the URL base domain name (e.g., binance.com).
	 *
	 * @param baseDomain Base domain name
	 */
	public static void setBaseDomain(final String baseDomain) {
		BASE_DOMAIN = baseDomain;
	}

	/**
	 * Get the URL base domain name (e.g., binance.com).
	 *
	 * @return The base domain for URLs
	 */
	public static String getBaseDomain() {
		return BASE_DOMAIN;
	}

	/**
	 * REST API base URL.
	 */
	public static String getApiBaseUrl() {
		return "http://18.140.43.178";
	}

	/**
	 * Streaming API base URL.
	 */
	public static String getStreamApiBaseUrl() {
		return "ws://18.140.43.178/socket/ws";
	}

	/**
	 * Asset info base URL.
	 */
	public static String getAssetInfoApiBaseUrl() {
		return String.format("https://%s/", getBaseDomain());
	}

    /**
     * Spot Test Network API base URL.
     */
    public static String getTestNetBaseUrl() {
		return String.format("https://%s", TESTNET_DOMAIN);
    }

    /**
     * Streaming Spot Test Network base URL.
     */
    public static String getStreamTestNetBaseUrl() {
        return String.format("wss://%s/ws", TESTNET_DOMAIN);
    }
}
