# Camunda IBM SLA Breach Causality Router

SLA breach causality router across Camunda process timers and IBM workload bottlenecks.

![ci](https://github.com/mizcausevic-dev/camunda-ibm-sla-breach-causality-router/actions/workflows/ci.yml/badge.svg)

## What this ships

This repo is a static Kinetic Gain evidence surface, not a placeholder page. It packages Camunda, IBM signals into a board-readable operating view with decision workflow, board-pack copy, related links, and validation checks:

- Exposure: where workflow, platform, or communications risk can become visible.
- Savings: where duplicate effort, drift, or manual coordination can be reduced.
- Investment: which next action deserves funding, ownership, or escalation.
- Story: how the evidence should be explained to executives or investors.

## Operating workflow

1. Ingest current platform signals, ownership notes, exception records, and timing windows.
2. Score exposure, savings, and investment pressure separately.
3. Route every lane to one accountable owner, one audience, and one next action.
4. Brief the decision in language that can survive board, investor, or diligence review.

## Live surface

- Product page: https://mizcausevic-dev.github.io/camunda-ibm-sla-breach-causality-router/
- Repository: https://github.com/mizcausevic-dev/camunda-ibm-sla-breach-causality-router
- Portfolio atlas: https://portfolio.kineticgain.com/

## Evidence lanes

- process timer drift
- batch handoff risk
- exception queues
- change-window exposure
- automation ROI
- SLA causality

## Related surfaces

- [Camunda IBM Exception To Change Risk Map](https://mizcausevic-dev.github.io/camunda-ibm-exception-to-change-risk-map/)
- [Camunda IBM Mainframe Handoff Ledger](https://mizcausevic-dev.github.io/camunda-ibm-mainframe-handoff-ledger/)
- [Camunda IBM Process Modernization Board](https://mizcausevic-dev.github.io/camunda-ibm-process-modernization-board/)
- [Camunda IBM Workflow Automation ROI Pack](https://mizcausevic-dev.github.io/camunda-ibm-workflow-automation-roi-pack/)

## Local verification

```bash
npm test
```

The validation script checks the data payload, generated page, interactive evidence table, related links, and footer links.
