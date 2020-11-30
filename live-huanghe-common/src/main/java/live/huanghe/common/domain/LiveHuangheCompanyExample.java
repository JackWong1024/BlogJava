package live.huanghe.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveHuangheCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveHuangheCompanyExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberIsNull() {
            addCriterion("company_members_number is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberIsNotNull() {
            addCriterion("company_members_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberEqualTo(String value) {
            addCriterion("company_members_number =", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberNotEqualTo(String value) {
            addCriterion("company_members_number <>", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberGreaterThan(String value) {
            addCriterion("company_members_number >", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberGreaterThanOrEqualTo(String value) {
            addCriterion("company_members_number >=", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberLessThan(String value) {
            addCriterion("company_members_number <", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberLessThanOrEqualTo(String value) {
            addCriterion("company_members_number <=", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberLike(String value) {
            addCriterion("company_members_number like", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberNotLike(String value) {
            addCriterion("company_members_number not like", value, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberIn(List<String> values) {
            addCriterion("company_members_number in", values, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberNotIn(List<String> values) {
            addCriterion("company_members_number not in", values, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberBetween(String value1, String value2) {
            addCriterion("company_members_number between", value1, value2, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyMembersNumberNotBetween(String value1, String value2) {
            addCriterion("company_members_number not between", value1, value2, "companyMembersNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeIsNull() {
            addCriterion("company_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeIsNotNull() {
            addCriterion("company_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeEqualTo(Date value) {
            addCriterion("company_start_time =", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeNotEqualTo(Date value) {
            addCriterion("company_start_time <>", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeGreaterThan(Date value) {
            addCriterion("company_start_time >", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_start_time >=", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeLessThan(Date value) {
            addCriterion("company_start_time <", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_start_time <=", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeIn(List<Date> values) {
            addCriterion("company_start_time in", values, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeNotIn(List<Date> values) {
            addCriterion("company_start_time not in", values, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeBetween(Date value1, Date value2) {
            addCriterion("company_start_time between", value1, value2, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_start_time not between", value1, value2, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeIsNull() {
            addCriterion("company_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeIsNotNull() {
            addCriterion("company_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeEqualTo(Date value) {
            addCriterion("company_end_time =", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeNotEqualTo(Date value) {
            addCriterion("company_end_time <>", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeGreaterThan(Date value) {
            addCriterion("company_end_time >", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_end_time >=", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeLessThan(Date value) {
            addCriterion("company_end_time <", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_end_time <=", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeIn(List<Date> values) {
            addCriterion("company_end_time in", values, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeNotIn(List<Date> values) {
            addCriterion("company_end_time not in", values, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeBetween(Date value1, Date value2) {
            addCriterion("company_end_time between", value1, value2, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_end_time not between", value1, value2, "companyEndTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}