package modelo;
// EN MANTENIMIENTO NO USAR ESTE MODELO 
import java.util.List;
// ESTE OBJETO JAVA ES UN MODELO QUE ACTUALMENTE NO SE ESTA USANDO EN EL CONTROLADOR 
public class Ciudad {

	public String lang;
    public String cityName;
    public String cityLatitude;
    public String cityLongitude;
    public int cityId;
    public boolean isCapital;
    public String stationName;
    public String tourismURL;
    public String tourismBoardName;
    public boolean isDep;
    public String timeZone;
    public String isDST;
    public Member member;
    public Forecast forecast;
    public Climate climate;

    public Ciudad() {
    }

    public Ciudad(String lang, String cityName, String cityLatitude, String cityLongitude, int cityId,
                    boolean isCapital, String stationName, String tourismURL, String tourismBoardName,
                    boolean isDep, String timeZone, String isDST, Member member, Forecast forecast, Climate climate) {
        this.lang = lang;
        this.cityName = cityName;
        this.cityLatitude = cityLatitude;
        this.cityLongitude = cityLongitude;
        this.cityId = cityId;
        this.isCapital = isCapital;
        this.stationName = stationName;
        this.tourismURL = tourismURL;
        this.tourismBoardName = tourismBoardName;
        this.isDep = isDep;
        this.timeZone = timeZone;
        this.isDST = isDST;
        this.member = member;
        this.forecast = forecast;
        this.climate = climate;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityLatitude() {
        return cityLatitude;
    }

    public void setCityLatitude(String cityLatitude) {
        this.cityLatitude = cityLatitude;
    }

    public String getCityLongitude() {
        return cityLongitude;
    }

    public void setCityLongitude(String cityLongitude) {
        this.cityLongitude = cityLongitude;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getTourismURL() {
        return tourismURL;
    }

    public void setTourismURL(String tourismURL) {
        this.tourismURL = tourismURL;
    }

    public String getTourismBoardName() {
        return tourismBoardName;
    }

    public void setTourismBoardName(String tourismBoardName) {
        this.tourismBoardName = tourismBoardName;
    }

    public boolean isDep() {
        return isDep;
    }

    public void setDep(boolean dep) {
        isDep = dep;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getIsDST() {
        return isDST;
    }

    public void setIsDST(String isDST) {
        this.isDST = isDST;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "lang='" + lang + '\'' +
                ", cityName='" + cityName + '\'' +
                ", cityLatitude='" + cityLatitude + '\'' +
                ", cityLongitude='" + cityLongitude + '\'' +
                ", cityId=" + cityId +
                ", isCapital=" + isCapital +
                ", stationName='" + stationName + '\'' +
                ", tourismURL='" + tourismURL + '\'' +
                ", tourismBoardName='" + tourismBoardName + '\'' +
                ", isDep=" + isDep +
                ", timeZone='" + timeZone + '\'' +
                ", isDST='" + isDST + '\'' +
                ", member=" + member +
                ", forecast=" + forecast +
                ", climate=" + climate +
                '}';
    }
}

class Member {
    private int memId;
    private String memName;
    private String url;
    private String orgName;
    private String logo;
    private int ra;

    public Member() {
    }

    public Member(int memId, String memName, String url, String orgName, String logo, int ra) {
        this.memId = memId;
        this.memName = memName;
        this.url = url;
        this.orgName = orgName;
        this.logo = logo;
        this.ra = ra;
    }

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memId=" + memId +
                ", memName='" + memName + '\'' +
                ", url='" + url + '\'' +
                ", orgName='" + orgName + '\'' +
                ", logo='" + logo + '\'' +
                ", ra=" + ra +
                '}';
    }
}

class Forecast {
    private String issueDate;
    private String timeZone;
    private List<ForecastDay> forecastDay;

    public Forecast() {
    }

    public Forecast(String issueDate, String timeZone, List<ForecastDay> forecastDay) {
        this.issueDate = issueDate;
        this.timeZone = timeZone;
        this.forecastDay = forecastDay;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public List<ForecastDay> getForecastDay() {
        return forecastDay;
    }

    public void setForecastDay(List<ForecastDay> forecastDay) {
        this.forecastDay = forecastDay;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "issueDate='" + issueDate + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", forecastDay=" + forecastDay +
                '}';
    }
}

class ForecastDay {
private String forecastDate;
private String wxdesc;
private String weather;
private double minTemp;
private double maxTemp;
private double minTempF;
private double maxTempF;
private int weatherIcon;

public ForecastDay() {
}

public ForecastDay(String forecastDate, String wxdesc, String weather, double minTemp, double maxTemp, double minTempF, double maxTempF, int weatherIcon) {
    this.forecastDate = forecastDate;
    this.wxdesc = wxdesc;
    this.weather = weather;
    this.minTemp = minTemp;
    this.maxTemp = maxTemp;
    this.minTempF = minTempF;
    this.maxTempF = maxTempF;
    this.weatherIcon = weatherIcon;
}

public String getForecastDate() {
    return forecastDate;
}

public void setForecastDate(String forecastDate) {
    this.forecastDate = forecastDate;
}

public String getWxdesc() {
    return wxdesc;
}

public void setWxdesc(String wxdesc) {
    this.wxdesc = wxdesc;
}

public String getWeather() {
    return weather;
}

public void setWeather(String weather) {
    this.weather = weather;
}

public double getMinTemp() {
    return minTemp;
}

public void setMinTemp(double minTemp) {
    this.minTemp = minTemp;
}

public double getMaxTemp() {
    return maxTemp;
}

public void setMaxTemp(double maxTemp) {
    this.maxTemp = maxTemp;
}

public double getMinTempF() {
    return minTempF;
}

public void setMinTempF(double minTempF) {
    this.minTempF = minTempF;
}

public double getMaxTempF() {
    return maxTempF;
}

public void setMaxTempF(double maxTempF) {
    this.maxTempF = maxTempF;
}

public int getWeatherIcon() {
    return weatherIcon;
}

public void setWeatherIcon(int weatherIcon) {
    this.weatherIcon = weatherIcon;
}

@Override
public String toString() {
    return "ForecastDay{" +
            "forecastDate='" + forecastDate + '\'' +
            ", wxdesc='" + wxdesc + '\'' +
            ", weather='" + weather + '\'' +
            ", minTemp=" + minTemp +
            ", maxTemp=" + maxTemp +
            ", minTempF=" + minTempF +
            ", maxTempF=" + maxTempF +
            ", weatherIcon=" + weatherIcon +
            '}';
}
}

class Climate {
private String raintype;
private double raindef;
private String rainunit;
private int datab;
private int datae;
private int tempb;
private int tempe;
private int rdayb;
private int rdaye;
private int rainfallb;
private int rainfalle;
private String climatefromclino;
private List<ClimateMonth> climateMonth;

public Climate() {
}

public Climate(String raintype, double raindef, String rainunit, int datab, int datae, int tempb, int tempe, int rdayb, int rdaye, int rainfallb, int rainfalle, String climatefromclino, List<ClimateMonth> climateMonth) {
    this.raintype = raintype;
    this.raindef = raindef;
    this.rainunit = rainunit;
    this.datab = datab;
    this.datae = datae;
    this.tempb = tempb;
    this.tempe = tempe;
    this.rdayb = rdayb;
    this.rdaye = rdaye;
    this.rainfallb = rainfallb;
    this.rainfalle = rainfalle;
    this.climatefromclino = climatefromclino;
    this.climateMonth = climateMonth;
}

public String getRaintype() {
    return raintype;
}

public void setRaintype(String raintype) {
    this.raintype = raintype;
}

public double getRaindef() {
    return raindef;
}

public void setRaindef(double raindef) {
    this.raindef = raindef;
}

public String getRainunit() {
    return rainunit;
}

public void setRainunit(String rainunit) {
    this.rainunit = rainunit;
}

public int getDatab() {
    return datab;
}

public void setDatab(int datab) {
    this.datab = datab;
}

public int getDatae() {
    return datae;
}

public void setDatae(int datae) {
    this.datae = datae;
}

public int getTempb() {
    return tempb;
}

public void setTempb(int tempb) {
    this.tempb = tempb;
}

public int getTempe() {
    return tempe;
}

public void setTempe(int tempe) {
    this.tempe = tempe;
}

public int getRdayb() {
    return rdayb;
}

public void setRdayb(int rdayb) {
    this.rdayb = rdayb;
}

public int getRdaye() {
    return rdaye;
}

public void setRdaye(int rdaye) {
    this.rdaye = rdaye;
}

public int getRainfallb() {
    return rainfallb;
}

public void setRainfallb(int rainfallb) {
    this.rainfallb = rainfallb;
}

public int getRainfalle() {
    return rainfalle;
}

public void setRainfalle(int rainfalle) {
    this.rainfalle = rainfalle;
}

public String getClimatefromclino() {
    return climatefromclino;
}

public void setClimatefromclino(String climatefromclino) {
    this.climatefromclino = climatefromclino;
}

public List<ClimateMonth> getClimateMonth() {
    return climateMonth;
}

public void setClimateMonth(List<ClimateMonth> climateMonth) {
    this.climateMonth = climateMonth;
}

@Override
public String toString() {
    return "Climate{" +
            "raintype='" + raintype + '\'' +
            ", raindef=" + raindef +
            ", rainunit='" + rainunit + '\'' +
            ", datab=" + datab +
            ", datae=" + datae +
            ", tempb=" + tempb +
            ", tempe=" + tempe +
            ", rdayb=" + rdayb +
            ", rdaye=" + rdaye +
            ", rainfallb=" + rainfallb +
            ", rainfalle=" + rainfalle +
            ", climatefromclino='" + climatefromclino + '\'' +
            ", climateMonth=" + climateMonth +
            '}';
}
}

class ClimateMonth {
private int month;
private double maxTemp;
private double minTemp;
private Double meanTemp;
private double maxTempF;
private double minTempF;
private Double meanTempF;
private double raindays;
private double rainfall;

public ClimateMonth() {
}

public ClimateMonth(int month, double maxTemp, double minTemp, Double meanTemp, double maxTempF, double minTempF, Double meanTempF, double raindays, double rainfall) {
    this.month = month;
    this.maxTemp = maxTemp;
    this.minTemp = minTemp;
    this.meanTemp = meanTemp;
    this.maxTempF = maxTempF;
    this.minTempF = minTempF;
    this.meanTempF = meanTempF;
    this.raindays = raindays;
    this.rainfall = rainfall;
}

public int getMonth() {
    return month;
}

public void setMonth(int month) {
    this.month = month;
}

public double getMaxTemp() {
    return maxTemp;
}

public void setMaxTemp(double maxTemp) {
    this.maxTemp = maxTemp;
}

public double getMinTemp() {
    return minTemp;
}

public void setMinTemp(double minTemp) {
    this.minTemp = minTemp;
}

public Double getMeanTemp() {
    return meanTemp;
}

public void setMeanTemp(Double meanTemp) {
    this.meanTemp = meanTemp;
}

public double getMaxTempF() {
    return maxTempF;
}

public void setMaxTempF(double maxTempF) {
    this.maxTempF = maxTempF;
}

public double getMinTempF() {
    return minTempF;
}

public void setMinTempF(double minTempF) {
    this.minTempF = minTempF;
}

public Double getMeanTempF() {
    return meanTempF;
}

public void setMeanTempF(Double meanTempF) {
    this.meanTempF = meanTempF;
}

public double getRaindays() {
    return raindays;
}

public void setRaindays(double raindays) {
    this.raindays = raindays;
}

public double getRainfall() {
    return rainfall;
}

public void setRainfall(double rainfall) {
    this.rainfall = rainfall;
}

@Override
public String toString() {
    return "ClimateMonth{" +
            "month=" + month +
            ", maxTemp=" + maxTemp +
            ", minTemp=" + minTemp +
            ", meanTemp=" + meanTemp +
            ", maxTempF=" + maxTempF +
            ", minTempF=" + minTempF +
            ", meanTempF=" + meanTempF +
            ", raindays=" + raindays +
            ", rainfall=" + rainfall +
            '}';
}
}

