package live.huanghe.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LiveHuangheJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LiveHuangheJobExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andJobCompanyIsNull() {
            addCriterion("job_company is null");
            return (Criteria) this;
        }

        public Criteria andJobCompanyIsNotNull() {
            addCriterion("job_company is not null");
            return (Criteria) this;
        }

        public Criteria andJobCompanyEqualTo(String value) {
            addCriterion("job_company =", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyNotEqualTo(String value) {
            addCriterion("job_company <>", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyGreaterThan(String value) {
            addCriterion("job_company >", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("job_company >=", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyLessThan(String value) {
            addCriterion("job_company <", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyLessThanOrEqualTo(String value) {
            addCriterion("job_company <=", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyLike(String value) {
            addCriterion("job_company like", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyNotLike(String value) {
            addCriterion("job_company not like", value, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyIn(List<String> values) {
            addCriterion("job_company in", values, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyNotIn(List<String> values) {
            addCriterion("job_company not in", values, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyBetween(String value1, String value2) {
            addCriterion("job_company between", value1, value2, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobCompanyNotBetween(String value1, String value2) {
            addCriterion("job_company not between", value1, value2, "jobCompany");
            return (Criteria) this;
        }

        public Criteria andJobDutiesIsNull() {
            addCriterion("job_duties is null");
            return (Criteria) this;
        }

        public Criteria andJobDutiesIsNotNull() {
            addCriterion("job_duties is not null");
            return (Criteria) this;
        }

        public Criteria andJobDutiesEqualTo(String value) {
            addCriterion("job_duties =", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesNotEqualTo(String value) {
            addCriterion("job_duties <>", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesGreaterThan(String value) {
            addCriterion("job_duties >", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesGreaterThanOrEqualTo(String value) {
            addCriterion("job_duties >=", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesLessThan(String value) {
            addCriterion("job_duties <", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesLessThanOrEqualTo(String value) {
            addCriterion("job_duties <=", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesLike(String value) {
            addCriterion("job_duties like", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesNotLike(String value) {
            addCriterion("job_duties not like", value, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesIn(List<String> values) {
            addCriterion("job_duties in", values, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesNotIn(List<String> values) {
            addCriterion("job_duties not in", values, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesBetween(String value1, String value2) {
            addCriterion("job_duties between", value1, value2, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobDutiesNotBetween(String value1, String value2) {
            addCriterion("job_duties not between", value1, value2, "jobDuties");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNull() {
            addCriterion("job_start_time is null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNotNull() {
            addCriterion("job_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeEqualTo(Date value) {
            addCriterion("job_start_time =", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotEqualTo(Date value) {
            addCriterion("job_start_time <>", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThan(Date value) {
            addCriterion("job_start_time >", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("job_start_time >=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThan(Date value) {
            addCriterion("job_start_time <", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("job_start_time <=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIn(List<Date> values) {
            addCriterion("job_start_time in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotIn(List<Date> values) {
            addCriterion("job_start_time not in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeBetween(Date value1, Date value2) {
            addCriterion("job_start_time between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("job_start_time not between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeIsNull() {
            addCriterion("jon_end_time is null");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeIsNotNull() {
            addCriterion("jon_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeEqualTo(Date value) {
            addCriterion("jon_end_time =", value, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeNotEqualTo(Date value) {
            addCriterion("jon_end_time <>", value, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeGreaterThan(Date value) {
            addCriterion("jon_end_time >", value, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jon_end_time >=", value, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeLessThan(Date value) {
            addCriterion("jon_end_time <", value, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("jon_end_time <=", value, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeIn(List<Date> values) {
            addCriterion("jon_end_time in", values, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeNotIn(List<Date> values) {
            addCriterion("jon_end_time not in", values, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeBetween(Date value1, Date value2) {
            addCriterion("jon_end_time between", value1, value2, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJonEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("jon_end_time not between", value1, value2, "jonEndTime");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNull() {
            addCriterion("job_content is null");
            return (Criteria) this;
        }

        public Criteria andJobContentIsNotNull() {
            addCriterion("job_content is not null");
            return (Criteria) this;
        }

        public Criteria andJobContentEqualTo(String value) {
            addCriterion("job_content =", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotEqualTo(String value) {
            addCriterion("job_content <>", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThan(String value) {
            addCriterion("job_content >", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentGreaterThanOrEqualTo(String value) {
            addCriterion("job_content >=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThan(String value) {
            addCriterion("job_content <", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLessThanOrEqualTo(String value) {
            addCriterion("job_content <=", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentLike(String value) {
            addCriterion("job_content like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotLike(String value) {
            addCriterion("job_content not like", value, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentIn(List<String> values) {
            addCriterion("job_content in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotIn(List<String> values) {
            addCriterion("job_content not in", values, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentBetween(String value1, String value2) {
            addCriterion("job_content between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobContentNotBetween(String value1, String value2) {
            addCriterion("job_content not between", value1, value2, "jobContent");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyIsNull() {
            addCriterion("job_technology is null");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyIsNotNull() {
            addCriterion("job_technology is not null");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyEqualTo(String value) {
            addCriterion("job_technology =", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyNotEqualTo(String value) {
            addCriterion("job_technology <>", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyGreaterThan(String value) {
            addCriterion("job_technology >", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("job_technology >=", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyLessThan(String value) {
            addCriterion("job_technology <", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyLessThanOrEqualTo(String value) {
            addCriterion("job_technology <=", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyLike(String value) {
            addCriterion("job_technology like", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyNotLike(String value) {
            addCriterion("job_technology not like", value, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyIn(List<String> values) {
            addCriterion("job_technology in", values, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyNotIn(List<String> values) {
            addCriterion("job_technology not in", values, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyBetween(String value1, String value2) {
            addCriterion("job_technology between", value1, value2, "jobTechnology");
            return (Criteria) this;
        }

        public Criteria andJobTechnologyNotBetween(String value1, String value2) {
            addCriterion("job_technology not between", value1, value2, "jobTechnology");
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