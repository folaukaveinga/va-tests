package com.folautech.va_test.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.time.DateUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * This object is store in redis
 * 
 * @author folaukaveinga
 */
@JsonInclude(value = Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiSession implements Serializable {

    private static final long serialVersionUID = 1L;

    // In case user needs to invalidate token
    private String            token;

    private long              userId;

    private String            userUuid;

    private long              accountId;

    private String            accountUuid;

    private long              customerId;

    private String            customerUuid;

    private String            firstName;

    private String            lastName;

    private Set<String>       userRoles;

    // last time token was used
    private Date              lastUsedTime;

    // expiration time
    private Date              expiredTime;

    // userAgent
    private String            deviceId;

    private String            clientIPAddress;

    public ApiSession extendLifeTimeOnRequest() {
        // expire next 24 hours
        this.setExpiredTime(DateUtils.addHours(new Date(), 24));
        return this;
    }

    public String getRolesAsStr() {
        return String.join(",", this.userRoles);
    }

    public void addUserRole(String userRole) {
        if (this.userRoles == null) {
            this.userRoles = new HashSet<>();
        }
        this.userRoles.add(userRole);
    }

}
