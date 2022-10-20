package com.khalifa.flight.data.remote.entity

import com.google.gson.annotations.SerializedName

data class FlightResponse(

    @field:SerializedName("data")
    val flights: List<FlightItem>? = null,

    @field:SerializedName("sort_version")
    val sortVersion: Int? = null,

    @field:SerializedName("search_id")
    val searchId: String? = null,

    @field:SerializedName("currency")
    val currency: String? = null,

    @field:SerializedName("fx_rate")
    val fxRate: Int? = null
)


data class RouteItem(

    @field:SerializedName("fare_classes")
    val fareClasses: String? = null,

    @field:SerializedName("latFrom")
    val latFrom: Double? = null,

    @field:SerializedName("mapIdto")
    val mapIdto: String? = null,

    @field:SerializedName("bags_recheck_required")
    val bagsRecheckRequired: Boolean? = null,

    @field:SerializedName("guarantee")
    val guarantee: Boolean? = null,

    @field:SerializedName("cityFrom")
    val cityFrom: String? = null,

    @field:SerializedName("operating_carrier")
    val operatingCarrier: String? = null,

    @field:SerializedName("lngFrom")
    val lngFrom: Double? = null,

    @field:SerializedName("dTimeUTC")
    val dTimeUTC: Int? = null,

    @field:SerializedName("vi_connection")
    val viConnection: Boolean? = null,

    @field:SerializedName("aTimeUTC")
    val aTimeUTC: Int? = null,

    @field:SerializedName("fare_category")
    val fareCategory: String? = null,

    @field:SerializedName("flight_no")
    val flightNo: Int? = null,

    @field:SerializedName("fare_basis")
    val fareBasis: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("airline")
    val airline: String? = null,

    @field:SerializedName("flyTo")
    val flyTo: String? = null,

    @field:SerializedName("fare_family")
    val fareFamily: String? = null,

    @field:SerializedName("cityCodeTo")
    val cityCodeTo: String? = null,

    @field:SerializedName("latTo")
    val latTo: Double? = null,

    @field:SerializedName("lngTo")
    val lngTo: Double? = null,

    @field:SerializedName("combination_id")
    val combinationId: String? = null,

    @field:SerializedName("equipment")
    val equipment: Any? = null,

    @field:SerializedName("vehicle_type")
    val vehicleType: String? = null,

    @field:SerializedName("cityTo")
    val cityTo: String? = null,

    @field:SerializedName("flyFrom")
    val flyFrom: String? = null,

    @field:SerializedName("aTime")
    val aTime: Int? = null,

    @field:SerializedName("mapIdfrom")
    val mapIdfrom: String? = null,

    @field:SerializedName("cityCodeFrom")
    val cityCodeFrom: String? = null,

    @field:SerializedName("dTime")
    val dTime: Int? = null,

    @field:SerializedName("operating_flight_no")
    val operatingFlightNo: String? = null,

    @field:SerializedName("original_return")
    val originalReturn: Int? = null,

    @field:SerializedName("return")
    val jsonMemberReturn: Int? = null,

    @field:SerializedName("following_airport_change")
    val followingAirportChange: Boolean? = null
)

data class Baglimit(

    @field:SerializedName("hand_length")
    val handLength: Int? = null,

    @field:SerializedName("personal_item_weight")
    val personalItemWeight: Int? = null,

    @field:SerializedName("hold_dimensions_sum")
    val holdDimensionsSum: Int? = null,

    @field:SerializedName("hold_width")
    val holdWidth: Int? = null,

    @field:SerializedName("hold_weight")
    val holdWeight: Int? = null,

    @field:SerializedName("hand_weight")
    val handWeight: Int? = null,

    @field:SerializedName("personal_item_length")
    val personalItemLength: Int? = null,

    @field:SerializedName("hand_height")
    val handHeight: Int? = null,

    @field:SerializedName("hold_length")
    val holdLength: Int? = null,

    @field:SerializedName("personal_item_height")
    val personalItemHeight: Int? = null,

    @field:SerializedName("hand_width")
    val handWidth: Int? = null,

    @field:SerializedName("hold_height")
    val holdHeight: Int? = null,

    @field:SerializedName("personal_item_width")
    val personalItemWidth: Int? = null
)

data class BagsPrice(

    @field:SerializedName("1")
    val jsonMember1: Float? = null,

    @field:SerializedName("2")
    val jsonMember2: Float? = null,

    @field:SerializedName("personal_item")
    val personalItem: Int? = null,

    @field:SerializedName("hand")
    val hand: Double? = null
)

data class Availability(

    @field:SerializedName("seats")
    val seats: Int? = null
)

data class Conversion(

    @field:SerializedName("EUR")
    val eUR: Int? = null
)

data class FlightItem(

    @field:SerializedName("fly_duration")
    val flyDuration: String? = null,

    @field:SerializedName("distance")
    val distance: Double? = null,

    @field:SerializedName("hashtags")
    val hashtags: List<String?>? = null,

    @field:SerializedName("tracking_pixel")
    val trackingPixel: String? = null,

    @field:SerializedName("mapIdto")
    val mapIdto: String? = null,

    @field:SerializedName("cityFrom")
    val cityFrom: String? = null,

    @field:SerializedName("availability")
    val availability: Availability? = null,

    @field:SerializedName("has_airport_change")
    val hasAirportChange: Boolean? = null,

    @field:SerializedName("dTimeUTC")
    val dTimeUTC: Int? = null,

    @field:SerializedName("aTimeUTC")
    val aTimeUTC: Int? = null,

    @field:SerializedName("duration")
    val duration: Duration? = null,

    @field:SerializedName("nightsInDest")
    val nightsInDest: Any? = null,

    @field:SerializedName("price")
    val price: Double? = null,

    @field:SerializedName("countryFrom")
    val countryFrom: CountryFrom? = null,

    @field:SerializedName("popularity")
    val popularity: Int? = null,

    @field:SerializedName("airlines")
    val airlines: List<String?>? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("flyTo")
    val flyTo: String? = null,

    @field:SerializedName("deep_link")
    val deepLink: String? = null,

    @field:SerializedName("conversion")
    val conversion: Conversion? = null,

    @field:SerializedName("cityCodeTo")
    val cityCodeTo: String? = null,

    @field:SerializedName("booking_token")
    val bookingToken: String? = null,

    @field:SerializedName("baglimit")
    val baglimit: Baglimit? = null,

    @field:SerializedName("cityTo")
    val cityTo: String? = null,

    @field:SerializedName("flyFrom")
    val flyFrom: String? = null,

    @field:SerializedName("countryTo")
    val countryTo: CountryTo? = null,

    @field:SerializedName("quality")
    val quality: Double? = null,

    @field:SerializedName("aTime")
    val aTime: Long? = null,

    @field:SerializedName("facilitated_booking_available")
    val facilitatedBookingAvailable: Boolean? = null,

    @field:SerializedName("route")
    val route: List<RouteItem?>? = null,

    @field:SerializedName("mapIdfrom")
    val mapIdfrom: String? = null,

    @field:SerializedName("cityCodeFrom")
    val cityCodeFrom: String? = null,

    @field:SerializedName("technical_stops")
    val technicalStops: Int? = null,

    @field:SerializedName("bags_price")
    val bagsPrice: BagsPrice? = null,

    @field:SerializedName("dTime")
    val dTime: Long? = null,

    @field:SerializedName("virtual_interlining")
    val virtualInterlining: Boolean? = null,

    @field:SerializedName("throw_away_ticketing")
    val throwAwayTicketing: Boolean? = null,

    @field:SerializedName("hidden_city_ticketing")
    val hiddenCityTicketing: Boolean? = null,

    @field:SerializedName("pnr_count")
    val pnrCount: Int? = null
)

data class Duration(

    @field:SerializedName("total")
    val total: Int? = null,

    @field:SerializedName("departure")
    val departure: Int? = null,

    @field:SerializedName("return")
    val jsonMemberReturn: Int? = null
)

data class CountryTo(

    @field:SerializedName("code")
    val code: String? = null,

    @field:SerializedName("name")
    val name: String? = null
)

data class CountryFrom(

    @field:SerializedName("code")
    val code: String? = null,

    @field:SerializedName("name")
    val name: String? = null
)
