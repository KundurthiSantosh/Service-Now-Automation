package responses;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "parent",
        "made_sla",
        "caused_by",
        "watch_list",
        "upon_reject",
        "sys_updated_on",
        "child_incidents",
        "hold_reason",
        "task_effective_number",
        "approval_history",
        "number",
        "resolved_by",
        "sys_updated_by",
        "opened_by",
        "user_input",
        "sys_created_on",
        "sys_domain",
        "state",
        "route_reason",
        "sys_created_by",
        "knowledge",
        "order",
        "calendar_stc",
        "closed_at",
        "cmdb_ci",
        "delivery_plan",
        "contract",
        "impact",
        "active",
        "work_notes_list",
        "business_service",
        "priority",
        "sys_domain_path",
        "rfc",
        "time_worked",
        "expected_start",
        "opened_at",
        "business_duration",
        "group_list",
        "work_end",
        "caller_id",
        "reopened_time",
        "resolved_at",
        "approval_set",
        "subcategory",
        "work_notes",
        "universal_request",
        "short_description",
        "close_code",
        "correlation_display",
        "delivery_task",
        "work_start",
        "assignment_group",
        "additional_assignee_list",
        "business_stc",
        "description",
        "calendar_duration",
        "close_notes",
        "notify",
        "service_offering",
        "sys_class_name",
        "closed_by",
        "follow_up",
        "parent_incident",
        "sys_id",
        "contact_type",
        "reopened_by",
        "incident_state",
        "urgency",
        "problem_id",
        "company",
        "reassignment_count",
        "activity_due",
        "assigned_to",
        "severity",
        "comments",
        "approval",
        "sla_due",
        "comments_and_work_notes",
        "due_date",
        "sys_mod_count",
        "reopen_count",
        "sys_tags",
        "escalation",
        "upon_approval",
        "correlation_id",
        "location",
        "category"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("parent")
    private String parent;
    @JsonProperty("made_sla")
    private String madeSla;
    @JsonProperty("caused_by")
    private String causedBy;
    @JsonProperty("watch_list")
    private String watchList;
    @JsonProperty("upon_reject")
    private String uponReject;
    @JsonProperty("sys_updated_on")
    private String sysUpdatedOn;
    @JsonProperty("child_incidents")
    private String childIncidents;
    @JsonProperty("hold_reason")
    private String holdReason;
    @JsonProperty("task_effective_number")
    private String taskEffectiveNumber;
    @JsonProperty("approval_history")
    private String approvalHistory;
    @JsonProperty("number")
    private String number;
    @JsonProperty("resolved_by")
    private String resolvedBy;
    @JsonProperty("sys_updated_by")
    private String sysUpdatedBy;
    @JsonProperty("opened_by")
    private OpenedBy openedBy;
    @JsonProperty("user_input")
    private String userInput;
    @JsonProperty("sys_created_on")
    private String sysCreatedOn;
    @JsonProperty("sys_domain")
    private SysDomain sysDomain;
    @JsonProperty("state")
    private String state;
    @JsonProperty("route_reason")
    private String routeReason;
    @JsonProperty("sys_created_by")
    private String sysCreatedBy;
    @JsonProperty("knowledge")
    private String knowledge;
    @JsonProperty("order")
    private String order;
    @JsonProperty("calendar_stc")
    private String calendarStc;
    @JsonProperty("closed_at")
    private String closedAt;
    @JsonProperty("cmdb_ci")
    private String cmdbCi;
    @JsonProperty("delivery_plan")
    private String deliveryPlan;
    @JsonProperty("contract")
    private String contract;
    @JsonProperty("impact")
    private String impact;
    @JsonProperty("active")
    private String active;
    @JsonProperty("work_notes_list")
    private String workNotesList;
    @JsonProperty("business_service")
    private String businessService;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("sys_domain_path")
    private String sysDomainPath;
    @JsonProperty("rfc")
    private String rfc;
    @JsonProperty("time_worked")
    private String timeWorked;
    @JsonProperty("expected_start")
    private String expectedStart;
    @JsonProperty("opened_at")
    private String openedAt;
    @JsonProperty("business_duration")
    private String businessDuration;
    @JsonProperty("group_list")
    private String groupList;
    @JsonProperty("work_end")
    private String workEnd;
    @JsonProperty("caller_id")
    private String callerId;
    @JsonProperty("reopened_time")
    private String reopenedTime;
    @JsonProperty("resolved_at")
    private String resolvedAt;
    @JsonProperty("approval_set")
    private String approvalSet;
    @JsonProperty("subcategory")
    private String subcategory;
    @JsonProperty("work_notes")
    private String workNotes;
    @JsonProperty("universal_request")
    private String universalRequest;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("close_code")
    private String closeCode;
    @JsonProperty("correlation_display")
    private String correlationDisplay;
    @JsonProperty("delivery_task")
    private String deliveryTask;
    @JsonProperty("work_start")
    private String workStart;
    @JsonProperty("assignment_group")
    private String assignmentGroup;
    @JsonProperty("additional_assignee_list")
    private String additionalAssigneeList;
    @JsonProperty("business_stc")
    private String businessStc;
    @JsonProperty("description")
    private String description;
    @JsonProperty("calendar_duration")
    private String calendarDuration;
    @JsonProperty("close_notes")
    private String closeNotes;
    @JsonProperty("notify")
    private String notify;
    @JsonProperty("service_offering")
    private String serviceOffering;
    @JsonProperty("sys_class_name")
    private String sysClassName;
    @JsonProperty("closed_by")
    private String closedBy;
    @JsonProperty("follow_up")
    private String followUp;
    @JsonProperty("parent_incident")
    private String parentIncident;
    @JsonProperty("sys_id")
    private String sysId;
    @JsonProperty("contact_type")
    private String contactType;
    @JsonProperty("reopened_by")
    private String reopenedBy;
    @JsonProperty("incident_state")
    private String incidentState;
    @JsonProperty("urgency")
    private String urgency;
    @JsonProperty("problem_id")
    private String problemId;
    @JsonProperty("company")
    private String company;
    @JsonProperty("reassignment_count")
    private String reassignmentCount;
    @JsonProperty("activity_due")
    private String activityDue;
    @JsonProperty("assigned_to")
    private String assignedTo;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("approval")
    private String approval;
    @JsonProperty("sla_due")
    private String slaDue;
    @JsonProperty("comments_and_work_notes")
    private String commentsAndWorkNotes;
    @JsonProperty("due_date")
    private String dueDate;
    @JsonProperty("sys_mod_count")
    private String sysModCount;
    @JsonProperty("reopen_count")
    private String reopenCount;
    @JsonProperty("sys_tags")
    private String sysTags;
    @JsonProperty("escalation")
    private String escalation;
    @JsonProperty("upon_approval")
    private String uponApproval;
    @JsonProperty("correlation_id")
    private String correlationId;
    @JsonProperty("location")
    private String location;
    @JsonProperty("category")
    private String category;

    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    @JsonProperty("made_sla")
    public String getMadeSla() {
        return madeSla;
    }

    @JsonProperty("made_sla")
    public void setMadeSla(String madeSla) {
        this.madeSla = madeSla;
    }

    @JsonProperty("caused_by")
    public String getCausedBy() {
        return causedBy;
    }

    @JsonProperty("caused_by")
    public void setCausedBy(String causedBy) {
        this.causedBy = causedBy;
    }

    @JsonProperty("watch_list")
    public String getWatchList() {
        return watchList;
    }

    @JsonProperty("watch_list")
    public void setWatchList(String watchList) {
        this.watchList = watchList;
    }

    @JsonProperty("upon_reject")
    public String getUponReject() {
        return uponReject;
    }

    @JsonProperty("upon_reject")
    public void setUponReject(String uponReject) {
        this.uponReject = uponReject;
    }

    @JsonProperty("sys_updated_on")
    public String getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    @JsonProperty("sys_updated_on")
    public void setSysUpdatedOn(String sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    @JsonProperty("child_incidents")
    public String getChildIncidents() {
        return childIncidents;
    }

    @JsonProperty("child_incidents")
    public void setChildIncidents(String childIncidents) {
        this.childIncidents = childIncidents;
    }

    @JsonProperty("hold_reason")
    public String getHoldReason() {
        return holdReason;
    }

    @JsonProperty("hold_reason")
    public void setHoldReason(String holdReason) {
        this.holdReason = holdReason;
    }

    @JsonProperty("task_effective_number")
    public String getTaskEffectiveNumber() {
        return taskEffectiveNumber;
    }

    @JsonProperty("task_effective_number")
    public void setTaskEffectiveNumber(String taskEffectiveNumber) {
        this.taskEffectiveNumber = taskEffectiveNumber;
    }

    @JsonProperty("approval_history")
    public String getApprovalHistory() {
        return approvalHistory;
    }

    @JsonProperty("approval_history")
    public void setApprovalHistory(String approvalHistory) {
        this.approvalHistory = approvalHistory;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("resolved_by")
    public String getResolvedBy() {
        return resolvedBy;
    }

    @JsonProperty("resolved_by")
    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    @JsonProperty("sys_updated_by")
    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    @JsonProperty("sys_updated_by")
    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    @JsonProperty("opened_by")
    public OpenedBy getOpenedBy() {
        return openedBy;
    }

    @JsonProperty("opened_by")
    public void setOpenedBy(OpenedBy openedBy) {
        this.openedBy = openedBy;
    }

    @JsonProperty("user_input")
    public String getUserInput() {
        return userInput;
    }

    @JsonProperty("user_input")
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    @JsonProperty("sys_created_on")
    public String getSysCreatedOn() {
        return sysCreatedOn;
    }

    @JsonProperty("sys_created_on")
    public void setSysCreatedOn(String sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    @JsonProperty("sys_domain")
    public SysDomain getSysDomain() {
        return sysDomain;
    }

    @JsonProperty("sys_domain")
    public void setSysDomain(SysDomain sysDomain) {
        this.sysDomain = sysDomain;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("route_reason")
    public String getRouteReason() {
        return routeReason;
    }

    @JsonProperty("route_reason")
    public void setRouteReason(String routeReason) {
        this.routeReason = routeReason;
    }

    @JsonProperty("sys_created_by")
    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    @JsonProperty("sys_created_by")
    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    @JsonProperty("knowledge")
    public String getKnowledge() {
        return knowledge;
    }

    @JsonProperty("knowledge")
    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    @JsonProperty("order")
    public String getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(String order) {
        this.order = order;
    }

    @JsonProperty("calendar_stc")
    public String getCalendarStc() {
        return calendarStc;
    }

    @JsonProperty("calendar_stc")
    public void setCalendarStc(String calendarStc) {
        this.calendarStc = calendarStc;
    }

    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("cmdb_ci")
    public String getCmdbCi() {
        return cmdbCi;
    }

    @JsonProperty("cmdb_ci")
    public void setCmdbCi(String cmdbCi) {
        this.cmdbCi = cmdbCi;
    }

    @JsonProperty("delivery_plan")
    public String getDeliveryPlan() {
        return deliveryPlan;
    }

    @JsonProperty("delivery_plan")
    public void setDeliveryPlan(String deliveryPlan) {
        this.deliveryPlan = deliveryPlan;
    }

    @JsonProperty("contract")
    public String getContract() {
        return contract;
    }

    @JsonProperty("contract")
    public void setContract(String contract) {
        this.contract = contract;
    }

    @JsonProperty("impact")
    public String getImpact() {
        return impact;
    }

    @JsonProperty("impact")
    public void setImpact(String impact) {
        this.impact = impact;
    }

    @JsonProperty("active")
    public String getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(String active) {
        this.active = active;
    }

    @JsonProperty("work_notes_list")
    public String getWorkNotesList() {
        return workNotesList;
    }

    @JsonProperty("work_notes_list")
    public void setWorkNotesList(String workNotesList) {
        this.workNotesList = workNotesList;
    }

    @JsonProperty("business_service")
    public String getBusinessService() {
        return businessService;
    }

    @JsonProperty("business_service")
    public void setBusinessService(String businessService) {
        this.businessService = businessService;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("sys_domain_path")
    public String getSysDomainPath() {
        return sysDomainPath;
    }

    @JsonProperty("sys_domain_path")
    public void setSysDomainPath(String sysDomainPath) {
        this.sysDomainPath = sysDomainPath;
    }

    @JsonProperty("rfc")
    public String getRfc() {
        return rfc;
    }

    @JsonProperty("rfc")
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @JsonProperty("time_worked")
    public String getTimeWorked() {
        return timeWorked;
    }

    @JsonProperty("time_worked")
    public void setTimeWorked(String timeWorked) {
        this.timeWorked = timeWorked;
    }

    @JsonProperty("expected_start")
    public String getExpectedStart() {
        return expectedStart;
    }

    @JsonProperty("expected_start")
    public void setExpectedStart(String expectedStart) {
        this.expectedStart = expectedStart;
    }

    @JsonProperty("opened_at")
    public String getOpenedAt() {
        return openedAt;
    }

    @JsonProperty("opened_at")
    public void setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
    }

    @JsonProperty("business_duration")
    public String getBusinessDuration() {
        return businessDuration;
    }

    @JsonProperty("business_duration")
    public void setBusinessDuration(String businessDuration) {
        this.businessDuration = businessDuration;
    }

    @JsonProperty("group_list")
    public String getGroupList() {
        return groupList;
    }

    @JsonProperty("group_list")
    public void setGroupList(String groupList) {
        this.groupList = groupList;
    }

    @JsonProperty("work_end")
    public String getWorkEnd() {
        return workEnd;
    }

    @JsonProperty("work_end")
    public void setWorkEnd(String workEnd) {
        this.workEnd = workEnd;
    }

    @JsonProperty("caller_id")
    public String getCallerId() {
        return callerId;
    }

    @JsonProperty("caller_id")
    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    @JsonProperty("reopened_time")
    public String getReopenedTime() {
        return reopenedTime;
    }

    @JsonProperty("reopened_time")
    public void setReopenedTime(String reopenedTime) {
        this.reopenedTime = reopenedTime;
    }

    @JsonProperty("resolved_at")
    public String getResolvedAt() {
        return resolvedAt;
    }

    @JsonProperty("resolved_at")
    public void setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    @JsonProperty("approval_set")
    public String getApprovalSet() {
        return approvalSet;
    }

    @JsonProperty("approval_set")
    public void setApprovalSet(String approvalSet) {
        this.approvalSet = approvalSet;
    }

    @JsonProperty("subcategory")
    public String getSubcategory() {
        return subcategory;
    }

    @JsonProperty("subcategory")
    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    @JsonProperty("work_notes")
    public String getWorkNotes() {
        return workNotes;
    }

    @JsonProperty("work_notes")
    public void setWorkNotes(String workNotes) {
        this.workNotes = workNotes;
    }

    @JsonProperty("universal_request")
    public String getUniversalRequest() {
        return universalRequest;
    }

    @JsonProperty("universal_request")
    public void setUniversalRequest(String universalRequest) {
        this.universalRequest = universalRequest;
    }

    @JsonProperty("short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    @JsonProperty("short_description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonProperty("close_code")
    public String getCloseCode() {
        return closeCode;
    }

    @JsonProperty("close_code")
    public void setCloseCode(String closeCode) {
        this.closeCode = closeCode;
    }

    @JsonProperty("correlation_display")
    public String getCorrelationDisplay() {
        return correlationDisplay;
    }

    @JsonProperty("correlation_display")
    public void setCorrelationDisplay(String correlationDisplay) {
        this.correlationDisplay = correlationDisplay;
    }

    @JsonProperty("delivery_task")
    public String getDeliveryTask() {
        return deliveryTask;
    }

    @JsonProperty("delivery_task")
    public void setDeliveryTask(String deliveryTask) {
        this.deliveryTask = deliveryTask;
    }

    @JsonProperty("work_start")
    public String getWorkStart() {
        return workStart;
    }

    @JsonProperty("work_start")
    public void setWorkStart(String workStart) {
        this.workStart = workStart;
    }

    @JsonProperty("assignment_group")
    public String getAssignmentGroup() {
        return assignmentGroup;
    }

    @JsonProperty("assignment_group")
    public void setAssignmentGroup(String assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
    }

    @JsonProperty("additional_assignee_list")
    public String getAdditionalAssigneeList() {
        return additionalAssigneeList;
    }

    @JsonProperty("additional_assignee_list")
    public void setAdditionalAssigneeList(String additionalAssigneeList) {
        this.additionalAssigneeList = additionalAssigneeList;
    }

    @JsonProperty("business_stc")
    public String getBusinessStc() {
        return businessStc;
    }

    @JsonProperty("business_stc")
    public void setBusinessStc(String businessStc) {
        this.businessStc = businessStc;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("calendar_duration")
    public String getCalendarDuration() {
        return calendarDuration;
    }

    @JsonProperty("calendar_duration")
    public void setCalendarDuration(String calendarDuration) {
        this.calendarDuration = calendarDuration;
    }

    @JsonProperty("close_notes")
    public String getCloseNotes() {
        return closeNotes;
    }

    @JsonProperty("close_notes")
    public void setCloseNotes(String closeNotes) {
        this.closeNotes = closeNotes;
    }

    @JsonProperty("notify")
    public String getNotify() {
        return notify;
    }

    @JsonProperty("notify")
    public void setNotify(String notify) {
        this.notify = notify;
    }

    @JsonProperty("service_offering")
    public String getServiceOffering() {
        return serviceOffering;
    }

    @JsonProperty("service_offering")
    public void setServiceOffering(String serviceOffering) {
        this.serviceOffering = serviceOffering;
    }

    @JsonProperty("sys_class_name")
    public String getSysClassName() {
        return sysClassName;
    }

    @JsonProperty("sys_class_name")
    public void setSysClassName(String sysClassName) {
        this.sysClassName = sysClassName;
    }

    @JsonProperty("closed_by")
    public String getClosedBy() {
        return closedBy;
    }

    @JsonProperty("closed_by")
    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    @JsonProperty("follow_up")
    public String getFollowUp() {
        return followUp;
    }

    @JsonProperty("follow_up")
    public void setFollowUp(String followUp) {
        this.followUp = followUp;
    }

    @JsonProperty("parent_incident")
    public String getParentIncident() {
        return parentIncident;
    }

    @JsonProperty("parent_incident")
    public void setParentIncident(String parentIncident) {
        this.parentIncident = parentIncident;
    }

    @JsonProperty("sys_id")
    public String getSysId() {
        return sysId;
    }

    @JsonProperty("sys_id")
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    @JsonProperty("contact_type")
    public String getContactType() {
        return contactType;
    }

    @JsonProperty("contact_type")
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    @JsonProperty("reopened_by")
    public String getReopenedBy() {
        return reopenedBy;
    }

    @JsonProperty("reopened_by")
    public void setReopenedBy(String reopenedBy) {
        this.reopenedBy = reopenedBy;
    }

    @JsonProperty("incident_state")
    public String getIncidentState() {
        return incidentState;
    }

    @JsonProperty("incident_state")
    public void setIncidentState(String incidentState) {
        this.incidentState = incidentState;
    }

    @JsonProperty("urgency")
    public String getUrgency() {
        return urgency;
    }

    @JsonProperty("urgency")
    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    @JsonProperty("problem_id")
    public String getProblemId() {
        return problemId;
    }

    @JsonProperty("problem_id")
    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonProperty("reassignment_count")
    public String getReassignmentCount() {
        return reassignmentCount;
    }

    @JsonProperty("reassignment_count")
    public void setReassignmentCount(String reassignmentCount) {
        this.reassignmentCount = reassignmentCount;
    }

    @JsonProperty("activity_due")
    public String getActivityDue() {
        return activityDue;
    }

    @JsonProperty("activity_due")
    public void setActivityDue(String activityDue) {
        this.activityDue = activityDue;
    }

    @JsonProperty("assigned_to")
    public String getAssignedTo() {
        return assignedTo;
    }

    @JsonProperty("assigned_to")
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("approval")
    public String getApproval() {
        return approval;
    }

    @JsonProperty("approval")
    public void setApproval(String approval) {
        this.approval = approval;
    }

    @JsonProperty("sla_due")
    public String getSlaDue() {
        return slaDue;
    }

    @JsonProperty("sla_due")
    public void setSlaDue(String slaDue) {
        this.slaDue = slaDue;
    }

    @JsonProperty("comments_and_work_notes")
    public String getCommentsAndWorkNotes() {
        return commentsAndWorkNotes;
    }

    @JsonProperty("comments_and_work_notes")
    public void setCommentsAndWorkNotes(String commentsAndWorkNotes) {
        this.commentsAndWorkNotes = commentsAndWorkNotes;
    }

    @JsonProperty("due_date")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("due_date")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("sys_mod_count")
    public String getSysModCount() {
        return sysModCount;
    }

    @JsonProperty("sys_mod_count")
    public void setSysModCount(String sysModCount) {
        this.sysModCount = sysModCount;
    }

    @JsonProperty("reopen_count")
    public String getReopenCount() {
        return reopenCount;
    }

    @JsonProperty("reopen_count")
    public void setReopenCount(String reopenCount) {
        this.reopenCount = reopenCount;
    }

    @JsonProperty("sys_tags")
    public String getSysTags() {
        return sysTags;
    }

    @JsonProperty("sys_tags")
    public void setSysTags(String sysTags) {
        this.sysTags = sysTags;
    }

    @JsonProperty("escalation")
    public String getEscalation() {
        return escalation;
    }

    @JsonProperty("escalation")
    public void setEscalation(String escalation) {
        this.escalation = escalation;
    }

    @JsonProperty("upon_approval")
    public String getUponApproval() {
        return uponApproval;
    }

    @JsonProperty("upon_approval")
    public void setUponApproval(String uponApproval) {
        this.uponApproval = uponApproval;
    }

    @JsonProperty("correlation_id")
    public String getCorrelationId() {
        return correlationId;
    }

    @JsonProperty("correlation_id")
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("madeSla");
        sb.append('=');
        sb.append(((this.madeSla == null)?"<null>":this.madeSla));
        sb.append(',');
        sb.append("causedBy");
        sb.append('=');
        sb.append(((this.causedBy == null)?"<null>":this.causedBy));
        sb.append(',');
        sb.append("watchList");
        sb.append('=');
        sb.append(((this.watchList == null)?"<null>":this.watchList));
        sb.append(',');
        sb.append("uponReject");
        sb.append('=');
        sb.append(((this.uponReject == null)?"<null>":this.uponReject));
        sb.append(',');
        sb.append("sysUpdatedOn");
        sb.append('=');
        sb.append(((this.sysUpdatedOn == null)?"<null>":this.sysUpdatedOn));
        sb.append(',');
        sb.append("childIncidents");
        sb.append('=');
        sb.append(((this.childIncidents == null)?"<null>":this.childIncidents));
        sb.append(',');
        sb.append("holdReason");
        sb.append('=');
        sb.append(((this.holdReason == null)?"<null>":this.holdReason));
        sb.append(',');
        sb.append("taskEffectiveNumber");
        sb.append('=');
        sb.append(((this.taskEffectiveNumber == null)?"<null>":this.taskEffectiveNumber));
        sb.append(',');
        sb.append("approvalHistory");
        sb.append('=');
        sb.append(((this.approvalHistory == null)?"<null>":this.approvalHistory));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("resolvedBy");
        sb.append('=');
        sb.append(((this.resolvedBy == null)?"<null>":this.resolvedBy));
        sb.append(',');
        sb.append("sysUpdatedBy");
        sb.append('=');
        sb.append(((this.sysUpdatedBy == null)?"<null>":this.sysUpdatedBy));
        sb.append(',');
        sb.append("openedBy");
        sb.append('=');
        sb.append(((this.openedBy == null)?"<null>":this.openedBy));
        sb.append(',');
        sb.append("userInput");
        sb.append('=');
        sb.append(((this.userInput == null)?"<null>":this.userInput));
        sb.append(',');
        sb.append("sysCreatedOn");
        sb.append('=');
        sb.append(((this.sysCreatedOn == null)?"<null>":this.sysCreatedOn));
        sb.append(',');
        sb.append("sysDomain");
        sb.append('=');
        sb.append(((this.sysDomain == null)?"<null>":this.sysDomain));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("routeReason");
        sb.append('=');
        sb.append(((this.routeReason == null)?"<null>":this.routeReason));
        sb.append(',');
        sb.append("sysCreatedBy");
        sb.append('=');
        sb.append(((this.sysCreatedBy == null)?"<null>":this.sysCreatedBy));
        sb.append(',');
        sb.append("knowledge");
        sb.append('=');
        sb.append(((this.knowledge == null)?"<null>":this.knowledge));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("calendarStc");
        sb.append('=');
        sb.append(((this.calendarStc == null)?"<null>":this.calendarStc));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("cmdbCi");
        sb.append('=');
        sb.append(((this.cmdbCi == null)?"<null>":this.cmdbCi));
        sb.append(',');
        sb.append("deliveryPlan");
        sb.append('=');
        sb.append(((this.deliveryPlan == null)?"<null>":this.deliveryPlan));
        sb.append(',');
        sb.append("contract");
        sb.append('=');
        sb.append(((this.contract == null)?"<null>":this.contract));
        sb.append(',');
        sb.append("impact");
        sb.append('=');
        sb.append(((this.impact == null)?"<null>":this.impact));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("workNotesList");
        sb.append('=');
        sb.append(((this.workNotesList == null)?"<null>":this.workNotesList));
        sb.append(',');
        sb.append("businessService");
        sb.append('=');
        sb.append(((this.businessService == null)?"<null>":this.businessService));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("sysDomainPath");
        sb.append('=');
        sb.append(((this.sysDomainPath == null)?"<null>":this.sysDomainPath));
        sb.append(',');
        sb.append("rfc");
        sb.append('=');
        sb.append(((this.rfc == null)?"<null>":this.rfc));
        sb.append(',');
        sb.append("timeWorked");
        sb.append('=');
        sb.append(((this.timeWorked == null)?"<null>":this.timeWorked));
        sb.append(',');
        sb.append("expectedStart");
        sb.append('=');
        sb.append(((this.expectedStart == null)?"<null>":this.expectedStart));
        sb.append(',');
        sb.append("openedAt");
        sb.append('=');
        sb.append(((this.openedAt == null)?"<null>":this.openedAt));
        sb.append(',');
        sb.append("businessDuration");
        sb.append('=');
        sb.append(((this.businessDuration == null)?"<null>":this.businessDuration));
        sb.append(',');
        sb.append("groupList");
        sb.append('=');
        sb.append(((this.groupList == null)?"<null>":this.groupList));
        sb.append(',');
        sb.append("workEnd");
        sb.append('=');
        sb.append(((this.workEnd == null)?"<null>":this.workEnd));
        sb.append(',');
        sb.append("callerId");
        sb.append('=');
        sb.append(((this.callerId == null)?"<null>":this.callerId));
        sb.append(',');
        sb.append("reopenedTime");
        sb.append('=');
        sb.append(((this.reopenedTime == null)?"<null>":this.reopenedTime));
        sb.append(',');
        sb.append("resolvedAt");
        sb.append('=');
        sb.append(((this.resolvedAt == null)?"<null>":this.resolvedAt));
        sb.append(',');
        sb.append("approvalSet");
        sb.append('=');
        sb.append(((this.approvalSet == null)?"<null>":this.approvalSet));
        sb.append(',');
        sb.append("subcategory");
        sb.append('=');
        sb.append(((this.subcategory == null)?"<null>":this.subcategory));
        sb.append(',');
        sb.append("workNotes");
        sb.append('=');
        sb.append(((this.workNotes == null)?"<null>":this.workNotes));
        sb.append(',');
        sb.append("universalRequest");
        sb.append('=');
        sb.append(((this.universalRequest == null)?"<null>":this.universalRequest));
        sb.append(',');
        sb.append("shortDescription");
        sb.append('=');
        sb.append(((this.shortDescription == null)?"<null>":this.shortDescription));
        sb.append(',');
        sb.append("closeCode");
        sb.append('=');
        sb.append(((this.closeCode == null)?"<null>":this.closeCode));
        sb.append(',');
        sb.append("correlationDisplay");
        sb.append('=');
        sb.append(((this.correlationDisplay == null)?"<null>":this.correlationDisplay));
        sb.append(',');
        sb.append("deliveryTask");
        sb.append('=');
        sb.append(((this.deliveryTask == null)?"<null>":this.deliveryTask));
        sb.append(',');
        sb.append("workStart");
        sb.append('=');
        sb.append(((this.workStart == null)?"<null>":this.workStart));
        sb.append(',');
        sb.append("assignmentGroup");
        sb.append('=');
        sb.append(((this.assignmentGroup == null)?"<null>":this.assignmentGroup));
        sb.append(',');
        sb.append("additionalAssigneeList");
        sb.append('=');
        sb.append(((this.additionalAssigneeList == null)?"<null>":this.additionalAssigneeList));
        sb.append(',');
        sb.append("businessStc");
        sb.append('=');
        sb.append(((this.businessStc == null)?"<null>":this.businessStc));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("calendarDuration");
        sb.append('=');
        sb.append(((this.calendarDuration == null)?"<null>":this.calendarDuration));
        sb.append(',');
        sb.append("closeNotes");
        sb.append('=');
        sb.append(((this.closeNotes == null)?"<null>":this.closeNotes));
        sb.append(',');
        sb.append("notify");
        sb.append('=');
        sb.append(((this.notify == null)?"<null>":this.notify));
        sb.append(',');
        sb.append("serviceOffering");
        sb.append('=');
        sb.append(((this.serviceOffering == null)?"<null>":this.serviceOffering));
        sb.append(',');
        sb.append("sysClassName");
        sb.append('=');
        sb.append(((this.sysClassName == null)?"<null>":this.sysClassName));
        sb.append(',');
        sb.append("closedBy");
        sb.append('=');
        sb.append(((this.closedBy == null)?"<null>":this.closedBy));
        sb.append(',');
        sb.append("followUp");
        sb.append('=');
        sb.append(((this.followUp == null)?"<null>":this.followUp));
        sb.append(',');
        sb.append("parentIncident");
        sb.append('=');
        sb.append(((this.parentIncident == null)?"<null>":this.parentIncident));
        sb.append(',');
        sb.append("sysId");
        sb.append('=');
        sb.append(((this.sysId == null)?"<null>":this.sysId));
        sb.append(',');
        sb.append("contactType");
        sb.append('=');
        sb.append(((this.contactType == null)?"<null>":this.contactType));
        sb.append(',');
        sb.append("reopenedBy");
        sb.append('=');
        sb.append(((this.reopenedBy == null)?"<null>":this.reopenedBy));
        sb.append(',');
        sb.append("incidentState");
        sb.append('=');
        sb.append(((this.incidentState == null)?"<null>":this.incidentState));
        sb.append(',');
        sb.append("urgency");
        sb.append('=');
        sb.append(((this.urgency == null)?"<null>":this.urgency));
        sb.append(',');
        sb.append("problemId");
        sb.append('=');
        sb.append(((this.problemId == null)?"<null>":this.problemId));
        sb.append(',');
        sb.append("company");
        sb.append('=');
        sb.append(((this.company == null)?"<null>":this.company));
        sb.append(',');
        sb.append("reassignmentCount");
        sb.append('=');
        sb.append(((this.reassignmentCount == null)?"<null>":this.reassignmentCount));
        sb.append(',');
        sb.append("activityDue");
        sb.append('=');
        sb.append(((this.activityDue == null)?"<null>":this.activityDue));
        sb.append(',');
        sb.append("assignedTo");
        sb.append('=');
        sb.append(((this.assignedTo == null)?"<null>":this.assignedTo));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("approval");
        sb.append('=');
        sb.append(((this.approval == null)?"<null>":this.approval));
        sb.append(',');
        sb.append("slaDue");
        sb.append('=');
        sb.append(((this.slaDue == null)?"<null>":this.slaDue));
        sb.append(',');
        sb.append("commentsAndWorkNotes");
        sb.append('=');
        sb.append(((this.commentsAndWorkNotes == null)?"<null>":this.commentsAndWorkNotes));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("sysModCount");
        sb.append('=');
        sb.append(((this.sysModCount == null)?"<null>":this.sysModCount));
        sb.append(',');
        sb.append("reopenCount");
        sb.append('=');
        sb.append(((this.reopenCount == null)?"<null>":this.reopenCount));
        sb.append(',');
        sb.append("sysTags");
        sb.append('=');
        sb.append(((this.sysTags == null)?"<null>":this.sysTags));
        sb.append(',');
        sb.append("escalation");
        sb.append('=');
        sb.append(((this.escalation == null)?"<null>":this.escalation));
        sb.append(',');
        sb.append("uponApproval");
        sb.append('=');
        sb.append(((this.uponApproval == null)?"<null>":this.uponApproval));
        sb.append(',');
        sb.append("correlationId");
        sb.append('=');
        sb.append(((this.correlationId == null)?"<null>":this.correlationId));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}